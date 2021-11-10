package com.example.sampleapp

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText

class FragmentSetunggal : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProvider(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setunggal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val textEditText = view.findViewById<TextInputEditText>(R.id.txtInputTextName)

        textEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p3: Int, p4: Int) {
                communicationViewModel!!.setTxt(p0.toString())

            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })
    }
    companion object {
        fun newInstance(): FragmentSetunggal {
            return FragmentSetunggal()
        }
    }
}