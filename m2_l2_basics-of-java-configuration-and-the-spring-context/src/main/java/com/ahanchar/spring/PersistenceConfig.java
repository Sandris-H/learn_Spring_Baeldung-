package com.ahanchar.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ahanchar.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class PersistenceConfig {

    @Bean
    public ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}
