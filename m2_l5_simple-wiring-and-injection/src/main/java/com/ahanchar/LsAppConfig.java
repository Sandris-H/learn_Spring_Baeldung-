package com.ahanchar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ahanchar.service.IProjectService;
import com.ahanchar.service.impl.ProjectServiceImplSetterInjection;

@Configuration
public class LsAppConfig {

    @Bean
    public IProjectService projectServiceImplSetterInjection() {
        return new ProjectServiceImplSetterInjection();
    }
}
