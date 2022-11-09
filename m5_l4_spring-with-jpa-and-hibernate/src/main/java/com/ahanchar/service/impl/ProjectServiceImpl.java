package com.ahanchar.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;
import com.ahanchar.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepo;

    public ProjectServiceImpl(IProjectRepository projectDao) {
        this.projectRepo = projectDao;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }

}
