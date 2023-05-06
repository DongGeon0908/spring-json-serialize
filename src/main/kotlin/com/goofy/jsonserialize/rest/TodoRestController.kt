package com.goofy.jsonserialize.rest

import com.goofy.jsonserialize.service.TodoService
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoRestController(
    private val todoService: TodoService
) {
}
