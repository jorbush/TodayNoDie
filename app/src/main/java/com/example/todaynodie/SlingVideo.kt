package com.example.todaynodie

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class SlingVideo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sling_video)

        val videoView = findViewById<VideoView>(R.id.videoSling)
        val path = "android.resource://" + getPackageName() + "/" + R.raw.slingvideo
        val uri = Uri.parse(path)
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}
