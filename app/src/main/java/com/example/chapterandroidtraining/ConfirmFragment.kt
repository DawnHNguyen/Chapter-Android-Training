package com.example.chapterandroidtraining

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.chapterandroidtraining.databinding.FragmentConfirmBinding


class ConfirmFragment : Fragment() {
    val args: ConfirmFragmentArgs by navArgs()
    lateinit var binding: FragmentConfirmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfirmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textviewConfirmTensanpham.text = args.productA.tenSanPham
        binding.textviewConfirmSoluong.text = args.productA.soLuong.toString()
        binding.textviewConfirmNhasanxuat.text = args.productA.nhaSanXuat
        binding.textviewConfirmNgaynhapkho.text = args.productA.ngayNhapKho
        binding.textviewConfirmLoaisanpham.text = args.productA.loaiSanPham
    }
}