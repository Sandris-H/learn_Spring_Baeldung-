package com.ahanchar.service;

import java.util.Optional;

import com.ahanchar.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Iterable<Project> findAll();

    Project save(Project project);
}
