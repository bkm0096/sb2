package org.rabe.sb2.todo.service;

import org.rabe.sb2.todo.entities.Todo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TodoService {

    Todo getOne(Long tno);

}
