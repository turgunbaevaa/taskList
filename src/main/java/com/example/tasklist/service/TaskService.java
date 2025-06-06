package com.example.tasklist.service;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task update(Task task);

    Task create(Task task, Long id);

    void deleteById(Long id);
}
