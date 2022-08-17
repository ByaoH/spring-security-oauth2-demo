package com.byaoh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity(debug = true)
@SpringBootApplication
public class SpringSecurityOauth2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauth2DemoApplication.class, args);
    }

}
