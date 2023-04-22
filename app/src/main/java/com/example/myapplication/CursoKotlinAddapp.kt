package com.example.myapplication

import android.app.Application
import com.google.android.gms.ads.MobileAds

class CursoKotlinAddapp:Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}