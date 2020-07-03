package com.ssj.callHi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class CallHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallHiApplication.class, args);
	}
	
	@RequestMapping(value="/CallHi",method = RequestMethod.GET)
	public String callingHi() {
	final String uri = "http://localhost:8888/greet";
	
	RestTemplate restTemplate = new RestTemplate();
	String result = restTemplate.getForObject(uri, String.class);
	
	return result;
	}
}
