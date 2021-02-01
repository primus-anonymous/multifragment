package com.example.multifragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class RedFragment : Fragment(R.layout.fragment_red) {

    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_random_code).setOnClickListener {
            mainViewModel.sendCode()
        }

        view.findViewById<Button>(R.id.btn_sos).setOnClickListener {
            SosDialog().show(childFragmentManager, SosDialog.TAG)
        }
    }
}