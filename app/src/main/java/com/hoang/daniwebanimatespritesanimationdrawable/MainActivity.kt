package com.hoang.daniwebanimatespritesanimationdrawable

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val santaImage = findViewById<ImageView>(R.id.image_santa)

        // Add Button IDs and Animation IDs into map for easy looping.
        val animationMap = mapOf(
            Pair(R.id.idle, R.drawable.idle),
            Pair(R.id.walk, R.drawable.walk),
            Pair(R.id.run, R.drawable.run),
            Pair(R.id.jump, R.drawable.jump),
            Pair(R.id.slide, R.drawable.slide),
            Pair(R.id.die, R.drawable.die)
        )

        for ((buttonId, animationId) in animationMap){
            findViewById<Button>(buttonId).setOnClickListener {
                santaImage.setImageResource(animationId)
                (santaImage.drawable as AnimationDrawable).start()
            }
        }
    }
}