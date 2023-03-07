package com.z0o0a.navigationtest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.z0o0a.navigationtest.model.Person

class PostOneVM : ViewModel() {
    var person = MutableLiveData<Person>()

    init {
        person.value = Person("", "")
    }
}