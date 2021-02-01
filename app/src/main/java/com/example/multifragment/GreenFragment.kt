package com.example.multifragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer

class GreenFragment : Fragment(R.layout.fragment_green) {

    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textCodeView = view.findViewById<TextView>(R.id.textCode)

        mainViewModel.codeValueLiveData.observe(viewLifecycleOwner, Observer {
            textCodeView.text = it
        })
    }
}