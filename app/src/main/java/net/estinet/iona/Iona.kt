package net.estinet.iona

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import net.estinet.iona.setup.SetupProcess
import android.widget.ImageView
import java.io.File
import android.view.animation.AnimationUtils
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

var systemDirectory: File = File("./")
var appCompatActivity: AppCompatActivity? = null
var savedInstance: Bundle? = null

class Iona : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //seshpenguin was here! 2017-02-02
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_iona)
        systemDirectory = getFilesDir()
        appCompatActivity = this
        savedInstance = savedInstanceState

        //Startup Sound
        val mediaPlayer = MediaPlayer.create(super.getBaseContext(), R.raw.music)
        mediaPlayer.start()

        val myImageView = findViewById(R.id.imageView) as ImageView
        val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        myImageView.startAnimation(myFadeInAnimation)

        Thread.sleep(5000)

        //Determine to launch setup or start program
        val file = File(systemDirectory, "setup.txt")
        if(!file.exists()){
            file.createNewFile()
            startBoot()
        }
        else{
            var br: BufferedReader? = null
            var fr: FileReader? = null
            try {
                fr = FileReader(file)
                br = BufferedReader(fr)
                br = BufferedReader(FileReader(file))
                val input = br.readLine()
                fr.close()
                br.close()
                if(input == "done") startBoot()
                else startSetup()
            } catch (e: IOException) {
                file.delete()
                file.createNewFile()
                try {
                    throw SetupFileReadFailedException()
                }
                catch(es: SetupFileReadFailedException){
                    es.printStackTrace()
                }
                startSetup()
            }
        }
    }
}

fun startBoot(){}
fun startSetup(){
    SetupProcess.checkSetupPart()
}