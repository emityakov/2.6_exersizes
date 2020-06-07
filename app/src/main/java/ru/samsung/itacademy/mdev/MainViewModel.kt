package ru.samsung.itacademy.mdev

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val counter = MutableLiveData<Int>()
    // Can also be written as:
    // val counter: LiveData<Int> = MutableLiveData<Int>()

    fun onIncrementClicked() {
        counter.value = (counter.value ?: 0) + 1
    }
}