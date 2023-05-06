package com.goofy.jsonserialize.config

import com.goofy.jsonserialize.repository.TodoLocalRepository
import com.goofy.jsonserialize.repository.TodoRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DatabaseConfig {
    @Bean
    fun todoRepository(): TodoRepository {
        return TodoLocalRepository()
    }
}
