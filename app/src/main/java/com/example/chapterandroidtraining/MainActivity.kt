package com.example.chapterandroidtraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.chapterandroidtraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
            val binding : ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.buttonMainConfirm.setOnClickListener {
            binding.textviewMainHeading.text = getString(R.string.main_confirmed)
        }
        binding.buttonMainBack.setOnClickListener {
            val intent : Intent = getIntent()
            finish()
            startActivity(intent)
        }
//        setContentView(R.layout.activity_main)
//        val button_confirm : Button = findViewById(R.id.button_main_confirm)
//        button_confirm.setOnClickListener {
//            val textview : TextView = findViewById(R.id.textview_main_heading)
//            textview.text = getString(R.string.main_confirmed)
//        }
//        val button_back : Button = findViewById(R.id.button_main_back)
//        button_back.setOnClickListener {
//            val intent : Intent = getIntent()
//            finish()
//            startActivity(intent)
//        }
    }
}