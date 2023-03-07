package com.z0o0a.navigationtest.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.z0o0a.navigationtest.viewmodel.PostOneVM
import com.z0o0a.navigationtest.databinding.PostOneBinding

class PostOne : Fragment() {

    private var binding: PostOneBinding? = null
    private val sharedViewModel: PostOneVM by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = PostOneBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 할일하기
    }

}