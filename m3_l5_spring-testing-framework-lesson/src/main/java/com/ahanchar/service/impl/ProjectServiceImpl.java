package com.ahanchar.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectRepository projectRepository;

    public ProjectServiceImpl() {
    }

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public IProjectRepository getProjectRepository() {
        return projectRepository;
    }

    public void setProjectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

}
