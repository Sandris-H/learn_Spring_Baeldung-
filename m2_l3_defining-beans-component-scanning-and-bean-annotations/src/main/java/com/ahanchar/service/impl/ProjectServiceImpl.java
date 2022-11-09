package com.ahanchar.service.impl;

import java.util.Optional;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.service.IProjectService;

@Service
@Lazy
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;

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

}
