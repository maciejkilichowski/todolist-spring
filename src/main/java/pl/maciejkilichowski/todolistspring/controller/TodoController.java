package pl.maciejkilichowski.todolistspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.maciejkilichowski.todolistspring.Repository.Todo;
import pl.maciejkilichowski.todolistspring.model.TodoEntity;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    @Autowired
    private Todo todoRepository;

    @GetMapping
    public List<TodoEntity> findAll(){

        return todoRepository.findAll()
    }
    @PostMapping
    public TodoEntity save(@Valid @NotNull @RequestBody TodoEntity todoEntity){
        return todoRepository.save(todoEntity);
    }
}
