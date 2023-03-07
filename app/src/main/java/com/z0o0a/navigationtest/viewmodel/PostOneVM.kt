package com.z0o0a.navigationtest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PostOneVM : ViewModel() {
    val name = MutableLiveData<String>()

    init {
        name.value = ""
    }
}