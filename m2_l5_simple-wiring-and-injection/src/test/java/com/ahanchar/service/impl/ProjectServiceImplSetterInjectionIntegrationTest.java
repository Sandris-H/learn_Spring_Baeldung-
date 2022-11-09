package com.ahanchar.service.impl;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ahanchar.persistence.model.Project;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceImplSetterInjectionIntegrationTest {

    @Autowired
    private ProjectServiceImplSetterInjection projectServiceImplSetterInjection;

    @Test
    public void givenNewProject_thenSavedSuccess() {
        Project newProject = new Project("First Project", LocalDate.now());

        assertNotNull(projectServiceImplSetterInjection.save(newProject));
    }
}
