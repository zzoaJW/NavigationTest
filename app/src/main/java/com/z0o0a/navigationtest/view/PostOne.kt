package com.z0o0a.navigationtest.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.z0o0a.navigationtest.R
import com.z0o0a.navigationtest.databinding.PostOneBinding
import com.z0o0a.navigationtest.viewmodel.PostVM

class PostOne : Fragment() {
    private lateinit var binding : PostOneBinding
    private val vm: PostVM by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = PostOneBinding.inflate(layoutInflater)
        binding.vm = vm
        binding.lifecycleOwner = requireActivity()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 할일하기
        binding.btnGoTwo.setOnClickListener {
            findNavController().navigate(R.id.postTwo)
        }
    }

}