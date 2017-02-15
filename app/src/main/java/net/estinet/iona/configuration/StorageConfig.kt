package net.estinet.iona.configuration

import android.content.SharedPreferences
import java.util.*

enum class StorageConfig{
    ;
    companion object : Config{
        override var values: ArrayList<String> = ArrayList<String>()
        init{
            for(value in StorageConfig.values()){
                values.add(value.toString())
            }
        }
        override fun fillValues(unfilledValues: List<String>, sp: SharedPreferences) = Unit
    }
}