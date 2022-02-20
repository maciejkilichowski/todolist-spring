package pl.maciejkilichowski.todolistspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.maciejkilichowski.todolistspring.model.TodoEntity;

public interface Todo extends JpaRepository<TodoEntity, Long> {

}
