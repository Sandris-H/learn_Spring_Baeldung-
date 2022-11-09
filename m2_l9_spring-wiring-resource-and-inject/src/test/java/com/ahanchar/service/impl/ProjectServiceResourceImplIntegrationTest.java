package com.ahanchar.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ahanchar.persistence.model.Project;

@SpringBootTest
public class ProjectServiceResourceImplIntegrationTest {

    @Autowired
    private ProjectServiceResourceImpl projectServiceResource;

    @Test
    public void givenNewProject_thenSaveSuccess() {
        Project project = new Project("Rest with Spring", LocalDate.now());

        assertNotNull(projectServiceResource.save(project));
    }

}