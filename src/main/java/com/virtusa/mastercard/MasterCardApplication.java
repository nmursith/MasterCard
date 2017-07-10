package com.virtusa.mastercard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })// Remove using password log
@EnableSwagger2

public class MasterCardApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(MasterCardApplication.class, args);
	}
	
	// Swagger ui configuration
	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select() 
          .apis(RequestHandlerSelectors.basePackage("com.virtusa.mastercard.resource"))              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());                                           
    }
     
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
          "MasterCard API Services",
          "MasterCard APIs for Smarter Banking",
          "V1.0",
          "Terms of service",
          "mmursith@virtusapolaris.com",
          "Virtusa|Polaris",
          "http://www.virtusapolaris.com");
        return apiInfo;
    }
}
