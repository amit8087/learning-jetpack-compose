package com.example.learningjetpackcompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StateTestViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _age = MutableLiveData<Int>()
    val age: LiveData<Int> = _age

    fun onNameUpdate(newName: String){
        _name.value = newName
    }

    fun onAgeUpdate(newAge: Int){
        _age.value = newAge
    }
}
