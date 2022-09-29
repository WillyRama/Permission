package com.willyramad.chapterlimatopicsatujson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.willyramad.chapterlimatopicsatujson.databinding.ActivityNormalPermissionBinding

class NormalPermission : AppCompatActivity() {
    lateinit var binding: ActivityNormalPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_permission)

        binding = ActivityNormalPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLoad.setOnClickListener {
            Glide.with(this).load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.tvGambar)
        }
    }
}