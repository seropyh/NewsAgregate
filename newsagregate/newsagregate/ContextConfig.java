package com.example.newsagregate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ContextConfig {

    @Bean
    public ListMsg listMsg() {
        return new ListMsg();
    }
}
