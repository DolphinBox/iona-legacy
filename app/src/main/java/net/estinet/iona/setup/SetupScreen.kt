package net.estinet.iona.setup

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.TextView
import net.estinet.iona.R

class SetupScreen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iona)
        val myImageView = findViewById(R.id.textView) as TextView
        val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        myImageView.startAnimation(myFadeInAnimation)
    }
}