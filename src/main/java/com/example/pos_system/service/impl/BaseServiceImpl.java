package com.example.pos_system.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

import com.example.pos_system.service.BaseService;

import jakarta.transaction.Transactional;

@Service
public abstract class BaseServiceImpl <T, D, ID extends Serializable> implements BaseService<T, D, ID> { 
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);
	
	public abstract JpaRepository<T, ID> getRepository();

	@Override
	public T create(T entity) {
		LOGGER.info("BaseServiceImpl.create()", entity);
		try {
            T createdEntity = getRepository().save(entity);
            LOGGER.info("Entity created: {}", createdEntity);
            return createdEntity;
        } catch (Exception e) {
            LOGGER.error("Error creating entity", e);
            throw e;
        }
	}

	@Override
    public List<T> getAll() {
        return getRepository().findAll();
    }

	@Override
	public Page<D> getAllWithPaginationAndSearch(Pageable pageable, String content) {
		Page<T> entities = getRepository().findAll(pageable);
		return entities.map(this::convertToDto);
	}

	@Override
	public T getById(ID id) {
		Optional<T> entity = getRepository().findById(id);
		return entity.orElse(null);
	}

	@Override
	@Transactional
	public T update(ID id, T entity) { 
		T existingEntity = getRepository().findById(id).orElse(null);
		if (existingEntity == null) {
			updateEntityField(existingEntity, entity);
			autoUpdateEntity(existingEntity);

			return getRepository().save(existingEntity);
		}
		return null;
	}

	private void updateEntityField(T existingEntity, T newEntity) { 
		Field[] fields = existingEntity.getClass().getDeclaredFields();
		System.out.println("Fields: " + fields);

		for (Field field : fields) {
			field.setAccessible(true);
			try { 
				if ("modifiedDate".equals(field.getName())) {
					field.set(existingEntity, System.currentTimeMillis());
				} else if ("modNum".equals(field.getName())) {
					int currentModNumber = (int) field.get(existingEntity);
					field.set(existingEntity, currentModNumber + 1);
				} else {
					Object value = field.get(newEntity);
					if (value != null) {
						field.set(existingEntity, value);
					}
				}
			} catch (IllegalAccessException e) {
				LOGGER.error("Error updating entity field", e);
				e.printStackTrace();
			}
		}
		getRepository().save(existingEntity);
	}

	private void autoUpdateEntity(T existingEntity) { 
		try { 
			// increase the modNumbs 
			Field modNumsField = getDeclaField(existingEntity.getClass(), "modNums");
			modNumsField.setAccessible(true);
			int currentModNumber = (int) modNumsField.get(existingEntity);
			modNumsField.set(existingEntity, currentModNumber + 1);

			// update the modifiedDate
			Field modifiedDateField = getDeclaField(existingEntity.getClass(), "modifiedDate");
			modifiedDateField.setAccessible(true);
			modifiedDateField.set(existingEntity, System.currentTimeMillis());


		} catch (NoSuchFieldException | IllegalAccessException e) {
			LOGGER.error("Error auto updating entity", e);
			e.printStackTrace();
		}
	}

	private Field getDeclaField(Class<?> clazz, String fieldName) throws NoSuchFieldException { 
		while(clazz != null) { 
			try { 
				return clazz.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
				clazz = clazz.getSuperclass();
			}
		}
		throw new NoSuchFieldException(fieldName);
	}

	@Override
	public void delete(ID id) {
		T existingEntity = getRepository().findById(id).orElse(null);
		if (existingEntity != null) {
			try { 
				Field statusField = getDeclaField(existingEntity.getClass(), "status");
				statusField.setAccessible(true);
				statusField.set(existingEntity, "DELETED");
				getRepository().save(existingEntity);
			} catch (NoSuchFieldException | IllegalAccessException e) {
				LOGGER.error("Error deleting entity", e);
				e.printStackTrace();
			}
		}
	}

	protected abstract D convertToDto(T entity);
} 