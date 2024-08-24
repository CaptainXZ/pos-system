package com.example.pos_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.pos_system.repository")
@EntityScan(basePackages = "com.example.pos_system.model")
public class PosSystemApplication {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(PosSystemApplication.class, args);
	}

}
