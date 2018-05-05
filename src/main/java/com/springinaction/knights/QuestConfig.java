package com.springinaction.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestConfig {
    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
