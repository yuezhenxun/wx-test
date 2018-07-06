package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ServletComponentScan
public class WxTestApplication {
	@RequestMapping("/hello")
	public String hell(){
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(WxTestApplication.class, args);
	}
}
