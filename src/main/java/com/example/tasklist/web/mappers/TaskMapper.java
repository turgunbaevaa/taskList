package com.example.tasklist.web.mappers;

import com.example.tasklist.web.dto.task.TaskDto;
import org.mapstruct.Mapper;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto taskDto);
}
