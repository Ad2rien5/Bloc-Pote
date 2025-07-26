package com.example.bloc_pote.model.enumeration

enum class Langage {
    ENGLISH,
    FRENCH;

    override fun toString(): String {
        return when (this) {
            ENGLISH -> "English"
            FRENCH -> "Français"
        }
    }
}