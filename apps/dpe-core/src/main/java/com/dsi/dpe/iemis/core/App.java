package com.dsi.dpe.iemis.core;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "DPE-Core", version = "v1", description = "DPE Core Service"))
public class App {

	private static Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		log.info("Application is started!!!");
	}

}
