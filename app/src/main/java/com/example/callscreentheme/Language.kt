package com.codility.multiplelanguage.model

import java.io.Serializable

/**
 * Created by Govind on 5/16/2018.
 */
class Language(name: String, code: String) : Serializable {

    lateinit var name: String
    lateinit var code: String

    companion object {

        fun getLanguageList(): ArrayList<Language> {
            val list = ArrayList<Language>()
            list.add(Language("Select Language", "lang"))
            list.add(Language("English", "en"))
            list.add(Language("Hindi", "hi"))
            list.add(Language("French", "fr"))
            list.add(Language("Portuguese", "pt"))
            list.add(Language("Russian", "ru"))
            list.add(Language("spanish", "es"))
            return list
        }
    }
}