package com.ahanchar.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ahanchar.persistence.model.Project;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long> {
    Iterable<Project> findByNameContaining(String name);
}
