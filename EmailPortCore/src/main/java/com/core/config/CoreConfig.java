package com.core.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(value = "com.core")
@EnableJpaRepositories(basePackages = "com.core.dao")
@EntityScan(basePackages = {"com.core.model.entity"})
@Configuration
public class CoreConfig {
}
