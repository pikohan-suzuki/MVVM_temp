package com.amebaownd.pikohan_nwiatori.mvvm_temp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.FragmentMainBinding

class MainFragment :Fragment(){

    private lateinit var binding :FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding = FragmentMainBinding.inflate(inflater,container,false).apply {
            lifecycleOwner = viewLifecycleOwner
            this.viewModel = viewModel
        }
        return binding.root
    }
}