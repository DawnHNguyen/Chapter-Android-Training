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
    lateinit var textviewProductType: TextView
    lateinit var textviewProductName: TextView
    lateinit var textviewProductAmount: TextView
    lateinit var textviewProducer: TextView
    lateinit var textviewInputDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_confirmed, container, false)
        textviewProductType = view.findViewById(R.id.textview_confirm_producttype)
        textviewProductName = view.findViewById(R.id.textview_confirm_productname)
        textviewProductAmount = view.findViewById(R.id.textview_confirm_productamount)
        textviewProducer = view.findViewById(R.id.textview_confirm_producer)
        textviewInputDate = view.findViewById(R.id.textview_confirm_inputdate)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textviewProductType.setText(args.produceType)
        textviewProductName.setText(args.productName)
        textviewProductAmount.setText(args.productAmount)
        textviewProducer.setText(args.producer)
        textviewInputDate.setText(args.inputDate)
    }

}