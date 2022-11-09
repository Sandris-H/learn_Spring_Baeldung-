package com.ahanchar;

import com.ahanchar.config.CustomBeanFactory;
import com.ahanchar.persistence.model.Project;
import com.ahanchar.service.IProjectService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CustomBeanFactoryTest {

    @Test
    void whenCustomBeanFactoryIsInvoked_thenReturnsProjectServiceBean() {
        Object bean = CustomBeanFactory.getBean("projectService");
        assertTrue(bean instanceof IProjectService);

        IProjectService projectService = (IProjectService) bean;
        assertNotNull(projectService.save(new Project("project1", LocalDate.now())));
    }
}
