package com.ahanchar.persistence.repository.impl;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProjectRepositoryBImpl implements IProjectRepository {

    @Override
    public Optional<Project> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Project save(Project project) {
        return null;
    }
}
