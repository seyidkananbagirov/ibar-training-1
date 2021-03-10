package com.anushka.viewmodeldemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var _count = MutableLiveData<Int>(0)
    val count: LiveData<Int>
        get() = _count

    fun updateCount() {
        _count.value = (_count.value)?.plus(1)
    }
}