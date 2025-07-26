package com.example.bloc_pote.model

import com.example.bloc_pote.exception.UnauthorisedAccessException
import java.util.UUID

abstract class Note(id: UUID?, protected var title: String, protected var comment: String?,
                    protected var private: Boolean
) {
    private val id: UUID = id ?: UUID.randomUUID()

    // getter
    fun getTitle(): String {
        if (!this.private) {
            return this.title
        }
        throw UnauthorisedAccessException()
    }

    fun getComment(): String {
        if (!this.private) {
            return this.comment ?: ""
        }
        throw UnauthorisedAccessException()
    }

    fun getId(): UUID {
        if (!this.private) {
            return this.id
        }
        throw UnauthorisedAccessException()
    }

    fun getPrivate(): Boolean = this.private

    // setter
    fun setTitle(newOne: String) {
        if (!this.private) {
            this.title = newOne
        }
        throw UnauthorisedAccessException()
    }

    fun setComment(newOne: String?) {
        if (!this.private) {
            this.comment = newOne
        }
        throw UnauthorisedAccessException()
    }

    fun changePrivate() {
        if (!this.private) {
            this.private = true
        }
        throw UnauthorisedAccessException()
    }
}