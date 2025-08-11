package com.example.blocpote.model

import com.example.blocpote.exception.UnauthorisedAccessException
import com.example.blocpote.model.enumeration.RemindType
import java.time.LocalDateTime
import java.util.UUID

class Reminder(
    id: UUID?, title: String, comment: String?, private: Boolean,
    private var begin: LocalDateTime, private var end: LocalDateTime?, private var rtype: RemindType
): Note(id, title, comment, private) {
    // getter
    fun getBegin(): LocalDateTime = this.begin

    fun getEnd(): LocalDateTime? = this.end

    fun getRtype(): RemindType = this.rtype

    // setter
    fun setBegin(newOne: LocalDateTime) {
        if (!this.private) {
            this.begin = newOne
        }
        throw UnauthorisedAccessException()
    }

    fun setEnd(newOne: LocalDateTime?) {
        if (!this.private) {
            this.end = newOne
        }
        throw UnauthorisedAccessException()
    }

    fun setRtype(newOne: RemindType) {
        if (!this.private) {
            this.rtype = newOne
        }
        throw UnauthorisedAccessException()
    }
}