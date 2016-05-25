package com.myolnir;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class ConfigClientApplication {

    @Value("${spring.hello.name}")
    String url;


    @RequestMapping("/")
    String hello() {
        return "Hello " + url + "!";
    }

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
