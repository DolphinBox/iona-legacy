package net.estinet.iona.setup

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.widget.ImageView
import net.estinet.iona.R

class NameView : AppCompatActivity() {

    /*
     * Specify name for Iona.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Created NameView AppCompatActivity...")
        //val myImageView = findViewById(R.id.imageView) as ImageView
        //fadeOutAndHideImage(myImageView)
        setContentView(R.layout.activity_name_view)
    }
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        println("Called onPostCreate() on NameView....")
    }

    private fun fadeOutAndHideImage(img: ImageView) {
        val fadeOut = AlphaAnimation(1f, 0f)
        println("Calling fadeOutAndHideImage on ${img.id}")
        fadeOut.interpolator = AccelerateInterpolator()
        fadeOut.duration = 1000

        fadeOut.setAnimationListener(object : AnimationListener {
            override fun onAnimationEnd(animation: Animation) {
                img.visibility = View.GONE
            }

            override fun onAnimationRepeat(animation: Animation) {}
            override fun onAnimationStart(animation: Animation) {}
        })

        img.startAnimation(fadeOut)
    }
}
