package com.ahanchar.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.ahanchar.persistence.model.Project;

public interface IProjectRepository extends CrudRepository<Project, Long> {
}
