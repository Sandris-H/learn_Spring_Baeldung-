package com.ahanchar.service;

import java.util.List;
import java.util.Optional;

import com.ahanchar.persistence.model.Task;

public interface ITaskService {
    Optional<Task> findById(Long id);

    Task save(Task task);

    Iterable<Task> saveAll(List<Task> tasks);

}
