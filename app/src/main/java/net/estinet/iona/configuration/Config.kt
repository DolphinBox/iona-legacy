package net.estinet.iona.configuration

import android.content.SharedPreferences
import java.util.*

interface Config{
    var values: ArrayList<String>
    fun fillValues(unfilledValues: List<String>, sp: SharedPreferences);
}
