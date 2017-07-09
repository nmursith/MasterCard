package com.virtusa.mastercard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })// Remove using password log
@EnableSwagger2

public class MasterCardApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(MasterCardApplication.class, args);
	}
}
