package com.ahanchar.service;

import com.ahanchar.exception.TaskNotSavedException;
import com.ahanchar.persistence.model.Task;

public interface ITaskService {

    Iterable<Task> findAll();

    Task save(Task task) throws TaskNotSavedException;
}
