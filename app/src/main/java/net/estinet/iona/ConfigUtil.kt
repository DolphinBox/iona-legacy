package net.estinet.iona

import android.provider.MediaStore
import com.google.gson.GsonBuilder
import java.io.File
import java.nio.

object ConfigUtil {
    fun getValueFromFile(file: File, value: String){

    }
    fun setupConfig(){
        val gson = GsonBuilder().create()

        gson.toJson("Hello", System.out)
        gson.toJson(123, System.out)
    }
}