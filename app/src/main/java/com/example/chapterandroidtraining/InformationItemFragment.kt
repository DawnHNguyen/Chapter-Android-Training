package com.example.chapterandroidtraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.navigation.findNavController


class InformationItemFragment : Fragment() {
    private lateinit var textviewHeading: TextView
    private lateinit var edittextLoaisanpham: EditText
    private lateinit var edittextTensanpham: EditText
    private lateinit var edittextSoluong: EditText
    private lateinit var edittextNhasanxuat: EditText
    private lateinit var edittextNgaynhapkho : EditText
    private lateinit var buttonBack: Button
    private lateinit var buttonConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_information_item, container, false)
        textviewHeading = view.findViewById(R.id.textview_informationitem_heading)
        edittextLoaisanpham = view.findViewById(R.id.edittext_informationitem_loaisanpham)
        edittextTensanpham = view.findViewById(R.id.edittext_informationitem_tensanpham)
        edittextSoluong = view.findViewById(R.id.edittext_informationitem_soluong)
        edittextNhasanxuat = view.findViewById(R.id.edittext_informationitem_nhasanxuat)
        edittextNgaynhapkho = view.findViewById(R.id.edittext_informationitem_ngaynhapkho)
        buttonBack = view.findViewById(R.id.button_informationitem_back)
        buttonConfirm = view.findViewById(R.id.button_informationitem_confirm)

        buttonConfirm.setOnClickListener {
            val loaisanpham: String = edittextLoaisanpham.text.toString()
            val tensanpham: String = edittextNhasanxuat.text.toString()
            val soluong: String = edittextSoluong.text.toString()
            val nhasanxuat: String = edittextNhasanxuat.text.toString()
            val ngaynhapkho: String = edittextNgaynhapkho.text.toString()

            val action = InformationItemFragmentDirections.actionInformationItemFragmentToConfirmedFragment(
            loaisanpham, tensanpham, soluong, nhasanxuat, ngaynhapkho)
            view.findNavController().navigate(action)

        }
        return view
    }
}