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
    private lateinit var edittextProductType: EditText
    private lateinit var edittextProductName: EditText
    private lateinit var edittextProductAmount: EditText
    private lateinit var edittextProducer: EditText
    private lateinit var edittextInputDate : EditText
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
        edittextProductType = view.findViewById(R.id.edittext_informationitem_producttype)
        edittextProductName = view.findViewById(R.id.edittext_informationitem_productname)
        edittextProductAmount = view.findViewById(R.id.edittext_informationitem_productamount)
        edittextProducer = view.findViewById(R.id.edittext_informationitem_producer)
        edittextInputDate = view.findViewById(R.id.edittext_informationitem_inputdate)
        buttonBack = view.findViewById(R.id.button_informationitem_back)
        buttonConfirm = view.findViewById(R.id.button_informationitem_confirm)

        buttonConfirm.setOnClickListener {
            val productType: String = edittextProductType.text.toString()
            val productName: String = edittextProducer.text.toString()
            val productAmount: String = edittextProductAmount.text.toString()
            val producer: String = edittextProducer.text.toString()
            val inputDate: String = edittextInputDate.text.toString()

            val action = InformationItemFragmentDirections.actionInformationItemFragmentToConfirmedFragment(
            productType, productName, productAmount, producer, inputDate)
            view.findNavController().navigate(action)

        }
        return view
    }
}