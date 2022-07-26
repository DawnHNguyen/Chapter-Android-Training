package com.example.chapterandroidtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chapterandroidtraining.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain2Binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main2
        )
        binding.buttonMain2Confirm.setOnClickListener {
            binding.textviewMain2Title.text = getString(R.string.main_danhapkhothanhcong)
        }

        binding.buttonMain2Back.setOnClickListener {
            binding.textviewMain2Title.text = getString(R.string.main_thongtinsanphamnhapkho)
            binding.edittextTensanpham.text.clear()
            binding.edittextNhasanxuat.text.clear()
            binding.edittextMain2Soluong.text.clear()
            binding.edittextMain2Ngaynhapkho.text.clear()
            binding.editextMain2Loaisanpham.text.clear()
        }
    }
}