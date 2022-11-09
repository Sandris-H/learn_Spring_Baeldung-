package com.ahanchar.service;

import java.util.List;
import java.util.Optional;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.model.Task;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);

    Iterable<Project> findAll();

    Project addTasks(Project project, List<Task> tasks);
}
