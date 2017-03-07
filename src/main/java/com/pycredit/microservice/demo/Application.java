package com.pycredit.microservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pycredit.microservice.http.util.HttpRest;
import com.pycredit.microservice.http.util.SpringRestImp;
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application {
	@Bean
	public HttpRest httpRest() {
		return new SpringRestImp();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
