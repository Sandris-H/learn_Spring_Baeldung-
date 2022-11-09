package com.ahanchar.persistence.repository;

import java.util.Optional;

import com.ahanchar.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
