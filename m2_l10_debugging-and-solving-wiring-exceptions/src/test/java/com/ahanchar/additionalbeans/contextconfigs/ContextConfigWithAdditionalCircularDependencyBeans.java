package com.ahanchar.additionalbeans.contextconfigs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.ahanchar.ls", "com.ahanchar.additionalbeans"})
public class ContextConfigWithAdditionalCircularDependencyBeans {

}
