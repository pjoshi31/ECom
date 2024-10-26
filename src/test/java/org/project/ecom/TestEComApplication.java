package org.project.ecom;

import org.springframework.boot.SpringApplication;

public class TestEComApplication {

    public static void main(String[] args) {
        SpringApplication.from(EComApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
