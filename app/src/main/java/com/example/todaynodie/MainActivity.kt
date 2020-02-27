package com.example.todaynodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openSettings(view: View) {
        val intent = Intent(this,SettingsActivity::class.java)
        startActivity(intent)
    }

    fun openSling(view: View) {
        val intent = Intent(this,SlingActivity::class.java)
        startActivity(intent)
    }

}
