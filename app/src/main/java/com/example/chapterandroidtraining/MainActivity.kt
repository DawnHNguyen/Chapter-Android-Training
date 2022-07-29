package com.example.chapterandroidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chapterandroidtraining.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,R.layout.activity_main
        )
        binding.buttonConfirm.setOnClickListener {
            binding.textviewInfoHeading.text = getString(R.string.button_confirm)
        }
    }
}