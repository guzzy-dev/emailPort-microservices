package com.api.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@ComponentScan(basePackages = "com")
@Configuration
@EnableAutoConfiguration
public class APIConfig extends WebMvcConfigurationSupport {
}
