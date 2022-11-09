package com.ahanchar.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.ahanchar.persistence.model.Task;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}
