package net.estinet.iona

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import java.io.File

var systemDirectory: File = File("./")

class Iona : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iona)
        systemDirectory = getFilesDir()
        //val mediaPlayer = MediaPlayer.create(super.getBaseContext(), R.raw.music)
        //mediaPlayer.start()
    }
}
