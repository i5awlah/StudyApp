package com.example.studyapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface

class CustomAlert(activity: Activity, title: String, message: String) {
    init {
        val dialogBuilder = AlertDialog.Builder(activity)
        dialogBuilder.setMessage(message)

            .setPositiveButton("OK", DialogInterface.OnClickListener
            {
                    dialog, id -> dialog.cancel()
            })

        val alert = dialogBuilder.create()
        alert.setTitle(title)
        alert.show()
    }
}