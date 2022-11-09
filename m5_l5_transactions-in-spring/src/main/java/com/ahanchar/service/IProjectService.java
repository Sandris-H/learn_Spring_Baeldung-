package com.ahanchar.service;

import java.util.Optional;

import com.ahanchar.exception.TaskNotSavedException;
import com.ahanchar.persistence.model.Project;

public interface IProjectService {
    Iterable<Project> findAll();

    Optional<Project> findById(Long id);

    Project save(Project project);

    void createProjectWithTasks() throws TaskNotSavedException;
}
