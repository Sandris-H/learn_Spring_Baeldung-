package com.ahanchar.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.service.IProjectService;

public class ProjectServiceImplSetterInjection implements IProjectService {

    private IProjectRepository projectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Autowired
    @Qualifier("projectRepositoryImpl2")
    public void setprojectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

}
