package net.estinet.iona.setup

import net.estinet.iona.SetupFileReadFailedException
import net.estinet.iona.systemDirectory
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import android.content.Intent

object SetupProcess {
    fun checkSetupPart(){
        val file = File(systemDirectory, "setup.txt")
        val intent = Intent(net.estinet.iona.appCompatActivity, SetupScreen::class.java)
        var appCompat = net.estinet.iona.appCompatActivity
        if(appCompat != null) appCompat.startActivity(intent)
        var br: BufferedReader? = null
        var fr: FileReader? = null
        try {
            fr = FileReader(file)
            br = BufferedReader(fr)
            br = BufferedReader(FileReader(file))
            val input = br.readLine()
            fr.close()
            br.close()

        } catch (e: IOException) {
            file.delete()
            file.createNewFile()
            try {
                throw SetupFileReadFailedException()
            }
            catch(es: SetupFileReadFailedException){
                es.printStackTrace()
            }
        }
    }

    fun startSetupProcess(){
        systemDirectory.deleteRecursively()
    }
}
