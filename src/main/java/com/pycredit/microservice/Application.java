package com.pycredit.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.pycredit.microservice.http.util.HttpRest;
import com.pycredit.microservice.http.util.HttpRestImp;
import com.pycredit.microservice.http.util.SpringRestImp;
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	@Bean
	public HttpRest httpRest() {
		return new SpringRestImp();
	}
	@Bean
	public HttpRest commonHttpRest() {
		return new HttpRestImp();
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
