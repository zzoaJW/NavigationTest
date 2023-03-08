package com.z0o0a.navigationtest.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.z0o0a.navigationtest.R
import com.z0o0a.navigationtest.databinding.NewActivityBinding

class NewActivity : AppCompatActivity() {
    private lateinit var binding: NewActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NewActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnRestart.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}