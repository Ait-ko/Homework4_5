package com.example.homework4_5

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class LoveViewModel : ViewModel() {
    private val repository = Repository()

    fun getLoveLiveData(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getData(firstName, secondName)
    }
}