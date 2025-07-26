package com.example.bloc_pote.model

import java.time.LocalDateTime
import java.util.UUID

class Reminder(
    id: UUID?, title: String, comment: String?, private: Boolean,
    private var begin: LocalDateTime, private var end: LocalDateTime?, private var rtype: RemindType
): Note(id, title, comment, private) {

}