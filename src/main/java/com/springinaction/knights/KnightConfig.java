package com.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Autowired
    private Quest quest;

    @Bean
    public Knight knight() {
        return new BraveKnight(quest);
    }
}
