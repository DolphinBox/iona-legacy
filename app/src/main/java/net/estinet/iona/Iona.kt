package net.estinet.iona

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer

class Iona : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iona)
        val mediaPlayer = MediaPlayer.create(super.getBaseContext(), R.raw.music)
        mediaPlayer.start()
    }
}
