package com.goofy.jsonserialize.repository

import com.goofy.jsonserialize.entity.Todo

class TodoLocalRepository : TodoRepository {
    private var todo: List<Todo> = emptyList()

    override fun findAll(): List<Todo> {
        return todo
    }

    override fun findByIdOrNull(id: Long): Todo? {
        return todo.firstOrNull { todo -> todo.id == id }
    }
}
