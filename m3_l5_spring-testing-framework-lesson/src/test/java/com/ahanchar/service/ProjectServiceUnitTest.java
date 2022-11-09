package com.ahanchar.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.service.impl.ProjectServiceImpl;

public class ProjectServiceUnitTest {

    @Mock
    IProjectRepository projectRepository;

    @InjectMocks
    ProjectServiceImpl projectService;

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenSavingProject_thenOK() {
        Project project = new Project("name", LocalDate.now());
        when(projectRepository.save(project)).thenReturn(project);

        Project savedProject = projectService.save(project);

        assertNotNull(savedProject);
    }
}
