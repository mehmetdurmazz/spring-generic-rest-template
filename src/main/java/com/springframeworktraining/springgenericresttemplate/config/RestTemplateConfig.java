package com.springframeworktraining.springgenericresttemplate.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig class creates a Spring RestTemplate object and customize it by using RestTemplateBuilder.
 * Root URI, Basic Authentication and any others configurations can be make in this class.
 * @author Mehmet Durmaz
 * @version 0.1.0
 * @since 0.1.0
 */

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
}
