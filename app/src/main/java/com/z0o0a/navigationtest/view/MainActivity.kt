package com.z0o0a.navigationtest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.z0o0a.navigationtest.R
import com.z0o0a.navigationtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}