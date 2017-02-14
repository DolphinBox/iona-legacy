package net.estinet.iona

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.ImageView
import net.estinet.iona.setup.SetupProcess
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

var systemDirectory: File = File("./")
var appCompatActivity: AppCompatActivity? = null
var savedInstance: Bundle? = null

class Iona : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("Starting Iona (Call from Iona Activity onCreate())")

        setContentView(R.layout.activity_iona)
        systemDirectory = getFilesDir()
        appCompatActivity = this
        savedInstance = savedInstanceState

        println("Playing startup sound...")

        //Startup Sound
        val mediaPlayer = MediaPlayer.create(super.getBaseContext(), R.raw.music)
        mediaPlayer.start()

        println("Starting fade animation for the Iona Logo...")

        val myImageView = findViewById(R.id.imageView) as ImageView
        val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        myImageView.startAnimation(myFadeInAnimation)
    }
    override fun onPostCreate(savedInstanceState: Bundle?){
        super.onPostCreate(savedInstanceState)
        println("Calling onPostCreate() for activity Iona...")
        val handler = Handler()
        handler.postDelayed({
            //Determine to launch setup or start program
            println("Determining whether to launch or start setup...")
            val file = File(systemDirectory, "setup.txt")
            if(!file.exists()){
                println("Setup file does not exist! Starting setup.")
                file.createNewFile()
                startSetup("")
            }
            else{
                println("Setup file does exist. Checking setup stage...")
                val fr: FileReader?
                try {
                    fr = FileReader(file)
                    val br = BufferedReader(FileReader(file))
                    val input = br.readLine()
                    fr.close()
                    br.close()
                    if(input == "done"){
                        println("Great! Setup file stage at \"done\". Starting boot.")
                        startBoot()
                    }
                    else{
                        println("Setup seems to have stopped at stage $input. Starting setup.")
                        if(input == null) startSetup("")
                        else startSetup(input)
                    }
                } catch (e: IOException) {
                    file.delete()
                    file.createNewFile()
                    try {
                        throw SetupFileReadFailedException()
                    }
                    catch(es: SetupFileReadFailedException){
                        es.printStackTrace()
                        println("Setup file corrupted.")
                    }
                    println("Starting setup process after failed file read (IOException).")
                    startSetup("")
                }
            }
        }, 5000)
    }
}

fun startBoot(){}
fun startSetup(part: String){
    SetupProcess.checkSetupPart(part)
}