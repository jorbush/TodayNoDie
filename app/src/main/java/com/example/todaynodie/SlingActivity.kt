package com.example.todaynodie

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class SlingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sling)


    }

    fun openVideoSling(view: View) {
        val intent = Intent(this,SlingVideo::class.java)
        startActivity(intent)
    }
}
