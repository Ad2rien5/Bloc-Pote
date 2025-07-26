package com.example.bloc_pote.model.enumeration

enum class RemindType {
    OneTime,
    Daily,
    Weekly,
    Monthly;

    override fun toString(): String {
        return when (this) {
            OneTime -> "1 Time"
            Daily -> "Daily"
            Weekly -> "Weekly"
            Monthly -> "Monthly"
        }
    }
}