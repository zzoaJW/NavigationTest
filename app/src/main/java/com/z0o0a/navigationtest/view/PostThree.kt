package com.z0o0a.navigationtest.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.z0o0a.navigationtest.R
import com.z0o0a.navigationtest.databinding.PostThreeBinding
import com.z0o0a.navigationtest.viewmodel.PostVM

class PostThree : Fragment() {
    private lateinit var binding : PostThreeBinding
    private val vm: PostVM by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = PostThreeBinding.inflate(layoutInflater)
        binding.vm = vm
        binding.lifecycleOwner = requireActivity()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 할일하기
        binding.btnFinish.setOnClickListener {
            val intent = Intent(activity, NewActivity::class.java)
            activity?.startActivity(intent)
            activity?.finish()
        }
    }
}