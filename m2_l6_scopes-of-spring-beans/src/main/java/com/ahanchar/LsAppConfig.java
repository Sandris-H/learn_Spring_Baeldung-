package com.ahanchar;

import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.persistence.repository.impl.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LsAppConfig {

    @Bean
    @Scope("prototype")
    public IProjectRepository prototypeBean() {
        return new ProjectRepositoryImpl();
    }

}