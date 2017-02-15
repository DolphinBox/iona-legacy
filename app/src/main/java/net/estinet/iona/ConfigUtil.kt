package net.estinet.iona

import net.estinet.iona.configuration.*
import java.io.File
import java.util.*

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
    fun getValueFromFile(file: File, value: String){

    }
    /*
     * Setup and check config for missing parts and open GUI when need.
     * @return nothing
     */
    fun setupConfig(){
        for(enum in ConfigUtil.enums){
            val sp = Iona.context!!.getSharedPreferences(enum.javaClass.name, 0)
            val unfilled = enum.values.filterNot { sp.contains(it) }
            if(unfilled.size != 0) enum.fillValues(unfilled, sp)
        }
    }
}