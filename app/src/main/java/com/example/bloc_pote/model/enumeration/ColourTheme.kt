package com.example.bloc_pote.model.enumeration

enum class ColourTheme {
    PURPLE;

    override fun toString(): String {
        return when (this) {
            PURPLE -> "purle"
        }
    }
}