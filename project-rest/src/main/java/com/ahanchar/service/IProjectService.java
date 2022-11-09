package com.ahanchar.service;

import java.util.Optional;

import com.ahanchar.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);

    Iterable<Project> findAll();

    void delete(Long id);

    Iterable<Project> findByName(String name);
}
