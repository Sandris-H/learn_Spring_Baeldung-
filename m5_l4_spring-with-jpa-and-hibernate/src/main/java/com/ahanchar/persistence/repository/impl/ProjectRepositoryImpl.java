package com.ahanchar.persistence.repository.impl;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public Optional<Project> findById(Long id) {
        Project entity = entityManager.find(Project.class, id);
        return Optional.ofNullable(entity);
    }

    @Transactional
    @Override
    public Project save(Project project) {
        entityManager.persist(project);
        return project;
    }

}
