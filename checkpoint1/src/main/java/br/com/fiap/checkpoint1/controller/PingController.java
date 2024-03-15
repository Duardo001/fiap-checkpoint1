package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {
	
	@Value("${spring.profiles.active}")
    private String activeProfile;

	    @GetMapping("/ping")
	    public String ping() {
	        if (activeProfile.contains("dev")) {
	            return "Pong em dev";
	        } else if (activeProfile.contains("stg")) {
	            return "Pong em stg";
	        } else if (activeProfile.contains("prd")) {
	            return "Pong em prd";
	        } else {
	            return "Pong";
	        }
	}
}

