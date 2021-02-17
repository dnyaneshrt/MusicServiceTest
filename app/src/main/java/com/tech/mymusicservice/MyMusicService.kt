package com.tech.mymusicservice

import android.content.ComponentName
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

//step 1:create a class as a child of android.app.Service
//onBind()
//onCreate(),onStartCommand(),onDestroy()
class MyMusicService:android.app.Service() {

    var mediaPlayer: MediaPlayer?=null
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        mediaPlayer= MediaPlayer.create(this,R.raw.mymusic)

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        mediaPlayer?.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.stop()
    }
}