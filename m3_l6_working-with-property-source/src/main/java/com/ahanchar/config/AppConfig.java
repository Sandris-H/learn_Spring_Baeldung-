package com.ahanchar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:additional.properties")
@Configuration
public class AppConfig {

}
