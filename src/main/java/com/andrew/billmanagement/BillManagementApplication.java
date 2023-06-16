package com.andrew.billmanagement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class BillManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillManagementApplication.class, args);
    }

}
