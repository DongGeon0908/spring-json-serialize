package com.goofy.jsonserialize.repository

import com.goofy.jsonserialize.entity.Todo

interface TodoRepository {
    fun findAll(): List<Todo>

    fun findByIdOrNull(id: Long): Todo?
}
