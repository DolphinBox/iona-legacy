package net.estinet.iona.configuration

import java.util.*

enum class NetworkConfig{
    SSID, PASSWORD, DHCP;
    companion object{
        var values: List<String> = ArrayList<String>()
    }
}