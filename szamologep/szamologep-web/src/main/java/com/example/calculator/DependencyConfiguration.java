package com.example.calculator;

import azazel.hu.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyConfiguration {

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }
}
