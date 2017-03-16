package net.estinet.iona.configuration

import android.content.Context
import android.content.SharedPreferences
import net.estinet.iona.Iona
import java.util.*

enum class SmartHomeConfig{
    ;
    companion object : Config{
        override var prefs: SharedPreferences = Iona.getSharedPreferences("SmartHomeConfig", Context.MODE_PRIVATE)
        override var values: ArrayList<String> = ArrayList<String>()
        init{
            for(value in SmartHomeConfig.values()){
                values.add(value.toString())
            }
        }
        override fun fillValues(unfilledValues: List<String>, sp: SharedPreferences) = Unit
    }
}