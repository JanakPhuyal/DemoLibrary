package com.ekbana.libra

import android.content.Context
import android.widget.Toast

class Event(var context: Context) {

    public fun showToast(name: String) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
    }
}