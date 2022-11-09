package com.ahanchar.service;

import java.util.Optional;

import com.ahanchar.persistence.model.Task;

public interface ITaskService {
    Optional<Task> findById(Long id);

    Task save(Task project);
}
