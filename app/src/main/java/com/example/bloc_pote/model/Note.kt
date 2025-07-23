package com.example.bloc_pote.model

import java.util.UUID

abstract class Note(id: UUID?, protected var title: String, protected var comment: String?,
                    private var private: Boolean
) {
    private val id: UUID = id ?: UUID.randomUUID()
}