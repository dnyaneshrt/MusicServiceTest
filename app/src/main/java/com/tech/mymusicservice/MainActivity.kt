package com.tech.mymusicservice

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    var btn1: Button? = null
    var btn2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button_play)
        btn2 = findViewById(R.id.button_stop)

        var intent = Intent(this, MyMusicService::class.java)
        btn1?.setOnClickListener {
            startService(intent)
        }
        btn2?.setOnClickListener {
            stopService(intent)


        }

    }
}