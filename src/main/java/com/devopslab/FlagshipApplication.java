
package com.devopslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlagshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlagshipApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Flagship Application Running Successfully";
    }
}
