package com.example.SpringBoot.controller.Config;

import com.example.SpringBoot.controller.UUIDGenerate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public UUIDGenerate uuidGenerate() {
        return new UUIDGenerate();
    }
}
