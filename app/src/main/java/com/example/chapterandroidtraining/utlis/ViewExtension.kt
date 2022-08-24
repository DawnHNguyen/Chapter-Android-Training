package com.example.chapterandroidtraining.utlis

import android.app.Activity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.showToast(msg: String){
    Toast.makeText(requireActivity(), msg, Toast.LENGTH_LONG).show()
}

fun Activity.showToast(msg: String){
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}

fun EditText.setGone(){
    this.visibility = View.GONE
}

fun EditText.setVisible(){
    this.visibility = View.VISIBLE
}