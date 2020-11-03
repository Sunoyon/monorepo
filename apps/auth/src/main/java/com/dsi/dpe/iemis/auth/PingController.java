package com.dsi.dpe.iemis.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class PingController {

	private static final Logger log = LoggerFactory.getLogger(PingController.class);
	
	@GetMapping(value = "/ping", produces = "application/json")
	@ApiResponse(responseCode = "200", description = "Service is running")
	public String getPing() {
		log.info("Hello!! Message from ping");
		return new String("Pong!");
	}

}
