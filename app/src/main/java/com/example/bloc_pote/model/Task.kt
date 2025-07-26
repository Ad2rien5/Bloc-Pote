package com.example.bloc_pote.model

import java.util.UUID

class Task(
    id: UUID?, title: String, comment: String?, private: Boolean,
    private var done: Boolean = false
): Note(id, title, comment, private) {

}