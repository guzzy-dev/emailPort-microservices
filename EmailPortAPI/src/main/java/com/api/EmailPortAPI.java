package com.api;

import com.api.config.APIConfig;
import com.core.config.CoreConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EmailPortAPI {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CoreConfig.class, APIConfig.class)
                .properties("spring.config.name:api")
                .build()
                .run(args);

    }
}
