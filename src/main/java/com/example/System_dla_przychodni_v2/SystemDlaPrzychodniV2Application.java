package com.example.System_dla_przychodni_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SystemDlaPrzychodniV2Application {

	@GetMapping("/test")
	String home() {
		return "TEST";
	}

	public static void main(String[] args) {
		SpringApplication.run(SystemDlaPrzychodniV2Application.class, args);
	}

}
