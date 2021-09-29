package com.example.basicanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    private lateinit var rotateAnimation: Animation
    private lateinit var floatingButton: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)
        floatingButton = findViewById(R.id.fabAdd)
        floatingButton.setOnClickListener { floatingButton.startAnimation(rotateAnimation) }
    }
}