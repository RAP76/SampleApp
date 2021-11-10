package com.example.sampleapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mTxt = MutableLiveData<String>()

    val text : LiveData<String>
        get() = mTxt

    fun setTxt(text : String) {
        mTxt.value = text
    }
}