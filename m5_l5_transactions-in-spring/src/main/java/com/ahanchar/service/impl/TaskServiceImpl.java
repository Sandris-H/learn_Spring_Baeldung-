package com.ahanchar.service.impl;

import org.springframework.stereotype.Service;

import com.ahanchar.exception.TaskNotSavedException;
import com.ahanchar.persistence.model.Task;
import com.ahanchar.persistence.repository.ITaskRepository;
import com.ahanchar.service.ITaskService;

@Service
public class TaskServiceImpl implements ITaskService {

    private ITaskRepository taskRepository;

    public TaskServiceImpl(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) throws TaskNotSavedException {
        throw new TaskNotSavedException("Unable to save task");
    }

}
