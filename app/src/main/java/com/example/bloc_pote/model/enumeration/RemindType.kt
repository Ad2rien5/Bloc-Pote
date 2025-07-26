package com.example.bloc_pote.model.enumeration

enum class RemindType {
    ONETIME,
    DAILY,
    WEEKLY,
    MONTHLY;

    override fun toString(): String {
        return when (this) {
            ONETIME -> "1 Time"
            DAILY -> "Daily"
            WEEKLY -> "Weekly"
            MONTHLY -> "Monthly"
        }
    }
}