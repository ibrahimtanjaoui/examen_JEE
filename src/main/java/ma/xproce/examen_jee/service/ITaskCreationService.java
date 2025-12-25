package ma.xproce.examen_jee.service;

import ma.xproce.examen_jee.dao.entities.Task;

public interface ITaskCreationService {
    Task createTask(String taskTitle,String username);
}
