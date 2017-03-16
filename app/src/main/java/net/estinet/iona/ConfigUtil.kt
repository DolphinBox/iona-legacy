package net.estinet.iona

import android.content.Context
import net.estinet.iona.configuration.*
import java.io.File
import java.util.*
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences



object ConfigUtil {
    val enums: ArrayList<Config> = ArrayList<Config>()
    init{
        enums.add(AlexaConfig)
        enums.add(BasicConfig)
        enums.add(NetworkConfig)
        enums.add(SmartHomeConfig)
        enums.add(StorageConfig)
        var defaults: ArrayList<List<String>> = ArrayList<List<String>>()
    }
    fun getValueFromFile(enums: Config, key: String): String? {
        val sharedPref = Iona.getAppContext().getSharedPreferences(enums.javaClass.name, Context.MODE_PRIVATE)
        val value = sharedPref.getString(key, 69.toString())
        return value
    }
    /*
     * Setup and check config for missing parts and open GUI when need.
     * @return nothing
     */
    fun setupConfig(){
        for(enum in ConfigUtil.enums){
            val sp = Iona.context!!.getSharedPreferences(enum.javaClass.name, 0)
            val unfilled = enum.values.filterNot { sp.contains(it) }
            if(unfilled.isNotEmpty()) enum.fillValues(unfilled, sp)
        }
    }
}