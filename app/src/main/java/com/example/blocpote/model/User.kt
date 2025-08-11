package com.example.blocpote.model

import com.example.blocpote.model.enumeration.ColorTheme
import com.example.blocpote.model.enumeration.Langage

class User private constructor() {
    var theme: ColorTheme = ColorTheme.PURPLE
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