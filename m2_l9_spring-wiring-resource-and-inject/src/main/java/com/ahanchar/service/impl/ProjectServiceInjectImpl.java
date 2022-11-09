package com.ahanchar.service.impl;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.service.IProjectService;

@Service
public class ProjectServiceInjectImpl implements IProjectService {
    private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceInjectImpl.class);
    private IProjectRepository projectRepository;

    @Inject
    @Named("projectRepositoryImpl")
    public ProjectServiceInjectImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
        LOG.info("wired projectRepository instance: {}", projectRepository);
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }


}
