package com.example.bloc_pote.model

import com.example.bloc_pote.model.enumeration.ColourTheme
import com.example.bloc_pote.model.enumeration.Langage

class User private constructor() {
    var theme: ColourTheme = ColourTheme.PURPLE
    var langage: Langage = Langage.ENGLISH
    var purgeTrash: Int = 15

    companion object {

        @Volatile
        private var instance: User? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: User().also { instance = it }
            }
    }
}