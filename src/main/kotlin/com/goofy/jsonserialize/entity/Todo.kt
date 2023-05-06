package com.goofy.jsonserialize.entity

import java.time.LocalDateTime

class Todo(
    val id: Long,
    val title: String,
    val content: String,
    val isDeleted: Boolean,
    val createdAt: LocalDateTime,
    val modifiedAt: LocalDateTime
)
