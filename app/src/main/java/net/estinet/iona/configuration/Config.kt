package net.estinet.iona.configuration

import android.content.SharedPreferences
import java.util.*
import java.io.File

interface Config{
    var values: ArrayList<String>
    var prefs: SharedPreferences
    fun fillValues(unfilledValues: List<String>, sp: SharedPreferences);
}
