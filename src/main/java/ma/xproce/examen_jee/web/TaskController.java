package ma.xproce.examen_jee.web;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ma.xproce.examen_jee.service.ITaskCreationService;

@Controller
@AllArgsConstructor
public class TaskController {
    private final ITaskCreationService taskCreationService;

    @PostMapping("/tasks/create")
    public String createTask(@RequestParam("title") String title,
                             @RequestParam("username") String username) {
        taskCreationService.createTask(title,username);
        return "success";
    }

    @GetMapping("/tasks/create")
    public String showCreateForm(){
        return "createTask";
    }
}
