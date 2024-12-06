package com.fullstack.movies.backend;

import com.fullstack.movies.backend.configurations.properties.MyCustomProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MyCustomProperties.class)
@SpringBootApplication
public class RichometreApplication {

	public static void main(String[] args) {
		SpringApplication.run(RichometreApplication.class, args);
	}

}
