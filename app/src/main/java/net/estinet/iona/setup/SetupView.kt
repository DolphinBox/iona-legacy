package net.estinet.iona.setup

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.TextView
import net.estinet.iona.R
import net.estinet.iona.appCompatActivity

class SetupView : AppCompatActivity() {
    //Welcome to Iona Screen.
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
            val myImageView = findViewById(R.id.textView) as TextView
            val myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            myImageView.startAnimation(myFadeInAnimation)
            val intent = Intent(appCompatActivity, NameView::class.java)
            var appCompat = net.estinet.iona.appCompatActivity
            appCompat!!.startActivity(intent)
        }, 10000)
    }
}
