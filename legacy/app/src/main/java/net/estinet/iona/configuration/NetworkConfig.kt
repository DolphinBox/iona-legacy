package net.estinet.iona.configuration

import android.content.Context
import android.content.SharedPreferences
import net.estinet.iona.Iona
import java.util.*

enum class NetworkConfig{
    SSID, PASSWORD, DHCP;
    companion object : Config{
        override var prefs: SharedPreferences = Iona.getSharedPreferences("NetworkConfig", Context.MODE_PRIVATE)
        override var values: ArrayList<String> = ArrayList<String>()
        init{
            for(value in NetworkConfig.values()){
                values.add(value.toString())
            }
        }
        override fun fillValues(unfilledValues: List<String>, sp: SharedPreferences) = Unit
    }
}