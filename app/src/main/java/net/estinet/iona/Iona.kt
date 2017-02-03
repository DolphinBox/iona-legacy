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
import android.view.animation.AnimationUtils
import android.view.animation.Animation



var systemDirectory: File = File("./")
var appCompatActivity: AppCompatActivity? = null
var savedInstance: Bundle? = null

class Iona : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_iona)
        systemDirectory = getFilesDir()
        appCompatActivity = this
        savedInstance = savedInstanceState

        val myImageView = findViewById(R.id.imageView) as ImageView
        val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        myImageView.startAnimation(myFadeInAnimation)

        //Determine to launch setup or start program

    }
}
