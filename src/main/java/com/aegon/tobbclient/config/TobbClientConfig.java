package com.aegon.tobbclient.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TobbClientConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
