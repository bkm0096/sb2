package org.rabe.sb2.todo.repository;

import org.rabe.sb2.todo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>{


  
}