package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityBannerBinding
import com.google.android.gms.ads.AdRequest

class BannerActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBannerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBannerBinding.inflate (layoutInflater)
        setContentView(binding.root)
        initLoadAds()
    }
    private fun initLoadAds() {

        val adRequest = AdRequest.Builder().build()
        binding.Banner.loadAd(adRequest)
    }
}