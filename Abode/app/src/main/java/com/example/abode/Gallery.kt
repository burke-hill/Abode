package com.example.abode

import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView

class Gallery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_gallery)

        // Create forward and back clickable buttons
        val backButton: ImageView = findViewById(R.id.backButton)
        val forwardButton: ImageView = findViewById(R.id.forwardButton)

        // Set counter to 0, displays first image
        var counter = 0


        // Back button listener
        backButton.setOnClickListener {
            counter--

            // Don't let counter go negative
            if (counter < 0) {
                counter = 1
            }

            // Call change image function
            println(counter)
            imageChange(counter)

        }

        // Forward button listener
        forwardButton.setOnClickListener {
            counter++

            // Don't let counter go too high
            if (counter > 1) {
                counter = 0
            }

            // Call change image function
            println(counter)
            imageChange(counter)

        }


    }

    // Function for changing image
    fun imageChange(counter: Int) {

        // Displays correct image according to counter
        if (counter == 0) {
            val image: ImageView = findViewById(R.id.imageView2)
            image.setImageResource(R.drawable.img1)
        }
        if (counter == 1) {
            val image: ImageView = findViewById(R.id.imageView2)
            image.setImageResource(R.drawable.img2)


        }


    }

}