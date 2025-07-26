package com.example.bloc_pote.model

import com.example.bloc_pote.exception.UnauthorisedAccessException
import java.util.UUID

class Task(
    id: UUID?, title: String, comment: String?, private: Boolean,
    private var done: Boolean = false
): Note(id, title, comment, private) {
    // getter
    fun getDone(): Boolean = this.done

    // setter
    fun changeDone() {
        if (!this.private) {
            this.done = !this.done
        }
        throw UnauthorisedAccessException()
    }
}