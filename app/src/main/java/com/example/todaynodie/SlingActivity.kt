package com.example.todaynodie

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class SlingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sling)

        val videoView = findViewById<VideoView>(R.id.videoSling)
        val uri = Uri.parse("https://r4---sn-5hne6ns6.googlevideo.com/videoplayback?expire=1582854859&ei=ax5YXpWmBa-Jir4PyMuz4Aw&ip=162.244.134.107&id=o-ADP21vahyzhoiPX0wtNa5olixp_qMO3IFk_HRBYCq7wB&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&gir=yes&clen=3113589&ratebypass=yes&dur=69.288&lmt=1389965936082251&fvip=4&fexp=23842630&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIhAOzSm5rAR8spqbp9Ii2hkakRKDl6zH4zfG7_hAxlrAFjAiB4bME61ATpDsI5sT2jiXB0Zh4RwIvTTbkc-Km9p9zAIA%3D%3D&title=First+Aid+Tutorial:+How+to+correctly+sling+an+arm+|+Training+Aid+Australia+Sydney&dl=1&redirect_counter=1&rm=sn-vgqels7l&req_id=b295f5f44384a3ee&cms_redirect=yes&mip=62.15.159.0&mm=34&mn=sn-5hne6ns6&ms=ltu&mt=1582833209&mv=m&mvi=3&pl=22&lsparams=mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRgIhAJ9ynD7gmWyKD16NOUn3z18d0s5QROZIaC5qumRJ_bwJAiEAnDPb2zelTPrkxzulykt7U0zD6q3nZE0sJQZEzBsUTzY%3D")
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}
