package net.estinet.iona.setup

import android.annotation.SuppressLint
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView

import net.estinet.iona.R

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SetupView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup_view)
    }
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        val myImageView = findViewById(R.id.textView) as TextView
        val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        myImageView.startAnimation(myFadeInAnimation)
    }
}
