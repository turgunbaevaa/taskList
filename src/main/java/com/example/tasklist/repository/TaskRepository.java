package com.example.tasklist.repository;

import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long userId, Long taskId);

    void updateTask(Task task);

    void deleteById(Long id);

    void createTask(Task task);
}
