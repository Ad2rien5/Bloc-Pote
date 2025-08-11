package com.example.blocpote.model.enumeration

enum class ColorTheme {
    PURPLE;

    override fun toString(): String {
        return when (this) {
            PURPLE -> "purle"
        }
    }
}