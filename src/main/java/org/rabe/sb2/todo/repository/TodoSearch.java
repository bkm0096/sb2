package org.rabe.sb2.todo.repository;

import java.util.List;

import org.rabe.sb2.todo.entities.Todo;
import org.springframework.data.domain.Pageable;


public interface TodoSearch {

    List<Todo> list1(Pageable pageable);    
}
