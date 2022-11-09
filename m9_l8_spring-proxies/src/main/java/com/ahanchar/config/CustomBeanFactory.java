package com.ahanchar.config;

import com.ahanchar.service.impl.SimpleProjectServiceProxy;

public class CustomBeanFactory {

    public static Object getBean(String beanName) {
        if ("projectService".equalsIgnoreCase(beanName)) {
            return new SimpleProjectServiceProxy();
        }
        return null;
    }
}
