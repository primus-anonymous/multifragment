package com.example.multifragment

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels

class SosDialog : DialogFragment() {

    companion object {
        const val TAG = "SosDialog"
    }

    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the Builder class for convenient dialog construction
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage(R.string.dialog_sos_title)
            .setPositiveButton(
                R.string.sos
            ) { dialog, id ->
                mainViewModel.sendSos()

            }
            .setNegativeButton(
                R.string.dialog_cancel
            ) { dialog, id ->
            }
        return builder.create()
    }

}