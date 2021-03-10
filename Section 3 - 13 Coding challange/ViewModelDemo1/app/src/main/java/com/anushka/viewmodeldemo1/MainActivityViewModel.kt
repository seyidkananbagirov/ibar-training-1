package com.anushka.viewmodeldemo1

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var calculatedNumber = 0

    fun add(arg: Int): String {
        calculatedNumber += arg
        return calculatedNumber.toString()
    }

    fun getNumber(): String {
        return calculatedNumber.toString()
    }

}