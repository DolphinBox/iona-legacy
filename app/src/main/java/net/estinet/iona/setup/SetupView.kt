package net.estinet.iona.setup

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import net.estinet.iona.*

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SetupView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup_view)
        println("Called onCreate() on SetupView...")
    }
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        println("Called onPostCreate() on onPostCreate()")
        val myImageView = findViewById(R.id.textView) as TextView
        val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        myImageView.startAnimation(myFadeInAnimation)
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(appCompatActivity, NameView::class.java)
            var appCompat = net.estinet.iona.appCompatActivity
            appCompat!!.startActivity(intent)
        }, 5000)
    }
}
