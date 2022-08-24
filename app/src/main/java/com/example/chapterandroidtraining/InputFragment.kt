package com.example.chapterandroidtraining

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.chapterandroidtraining.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    lateinit var binding: FragmentInputBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInputBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clearTextInput()
        validateInput()
    }

    private fun clearTextInput() {
        binding.apply {
            buttonInputBack.setOnClickListener {
                textviewInputTitle.text = getString(R.string.main_thongtinsanphamnhapkho)
                edittextInputTensanpham.text.clear()
                edittextInputNhasanxuat.text.clear()
                edittextInputSoluong.text.clear()
                edittextInputNgaynhapkho.text.clear()
                editextInputLoaisanpham.text.clear()
            }
        }
    }

    private fun validateInput() {
        binding.apply {
            buttonInputConfirm.setOnClickListener {
                var isCheck = true
                val tenSanPham = edittextInputTensanpham.text.toString()
                val soLuongString = edittextInputSoluong.text.toString()

                val nhaSanXuat = edittextInputNhasanxuat.text.toString()
                val ngayNhapKho = edittextInputNgaynhapkho.text.toString()
                val loaiSanPham = editextInputLoaisanpham.text.toString()

                if (loaiSanPham.isEmpty() || loaiSanPham.isBlank()) {
                    binding.editextInputLoaisanpham.error = "enter loại sản phẩm"
                    isCheck = false
                }
                if (tenSanPham.isEmpty() || tenSanPham.isBlank()) {
                    binding.edittextInputTensanpham.error = "enter tên sản phẩm"
                    isCheck = false

                }
                if (soLuongString.isEmpty() || soLuongString.isBlank()) {
                    binding.edittextInputSoluong.error = "enter số lượng"
                    isCheck = false
                }
                if (nhaSanXuat.isEmpty() || nhaSanXuat.isBlank()) {
                    binding.edittextInputNhasanxuat.error = "enter nhà sản xuất"
                    isCheck = false
                }
                if (ngayNhapKho.isEmpty() || ngayNhapKho.isBlank()) {
                    binding.edittextInputNgaynhapkho.error = "enter ngày nhập kho"
                    isCheck = false
                }

                if (!isCheck) {
                    return@setOnClickListener
                } else {
                    val soLuong = soLuongString.toInt()
                    val productResult =
                        Product(loaiSanPham, tenSanPham, soLuong, nhaSanXuat, ngayNhapKho)

                    val action =
                        InputFragmentDirections.actionInputFragmentToConfirmFragment(productResult)
                    findNavController().navigate(action)
                }
            }
        }
    }
}