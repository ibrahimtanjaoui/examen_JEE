package ma.xproce.examen_jee.service;

import ma.xproce.examen_jee.dao.entities.Task;
import ma.xproce.examen_jee.dao.entities.User;
import ma.xproce.examen_jee.dao.repositories.TacheRepository;
import ma.xproce.examen_jee.dao.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskCreationServiceImpl implements ITaskCreationService{

    private final UserRepository userRepository;
    private final TacheRepository tacheRepository;

    public TaskCreationServiceImpl(UserRepository userRepository, TacheRepository tacheRepository){
        this.tacheRepository=tacheRepository;
        this.userRepository=userRepository;
    }
    @Override
    public Task createTask(String taskTitle, String username){
        User user=userRepository.findByUsername(username);

        Task task = new Task();
        task.setTitle(taskTitle);
        task.setUser(user);
        return tacheRepository.save(task);

    }
}
