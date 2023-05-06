package com.goofy.jsonserialize.service

import com.goofy.jsonserialize.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {


}
