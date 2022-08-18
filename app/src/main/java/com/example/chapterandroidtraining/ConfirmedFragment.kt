package com.example.chapterandroidtraining

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs

class ConfirmedFragment : Fragment() {

    val args: ConfirmedFragmentArgs by navArgs()
    lateinit var fragmentConfirm: ConfirmedFragment
    lateinit var textviewLoaisanpham: TextView
    lateinit var textViewTensanpham: TextView
    lateinit var textViewSoluong: TextView
    lateinit var textViewNhasanxuat: TextView
    lateinit var textviewNgaynhapkho: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_confirmed, container, false)
        textviewLoaisanpham = view.findViewById(R.id.textview_confirm_loaisanpham)
        textViewTensanpham = view.findViewById(R.id.textview_confirm_tensanpham)
        textViewSoluong = view.findViewById(R.id.textview_confirm_soluong)
        textViewNhasanxuat = view.findViewById(R.id.textview_confirm_nhasanxuat)
        textviewNgaynhapkho = view.findViewById(R.id.textview_confirm_ngaynhapkho)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textviewLoaisanpham.setText(args.textviewNavgraphLoaisanpham)
        textViewTensanpham.setText(args.textviewNavgraphTensanpham)
        textViewSoluong.setText(args.textviewNavgraphSoluong)
        textViewNhasanxuat.setText(args.textviewNavgraphNhasanxuat)
        textviewNgaynhapkho.setText(args.textviewNavgraphNgaynhapkho)
    }

}