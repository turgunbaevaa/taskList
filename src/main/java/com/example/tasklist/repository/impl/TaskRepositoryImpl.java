package com.example.tasklist.repository.impl;

import com.example.tasklist.repository.TaskRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void assignToUserById(Long userId, Long taskId) {

    }

    @Override
    public void updateTask(Task task) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void createTask(Task task) {

    }
}
