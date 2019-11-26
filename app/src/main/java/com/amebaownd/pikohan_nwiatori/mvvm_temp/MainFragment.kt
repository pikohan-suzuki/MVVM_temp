package com.amebaownd.pikohan_nwiatori.mvvm_temp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.FragmentMainBinding

class MainFragment :Fragment(){

    private lateinit var binding :FragmentMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding = FragmentMainBinding.inflate(inflater,container,false).apply {
            lifecycleOwner = viewLifecycleOwner
            this.viewModel = this@MainFragment.viewModel
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.onClearEvent.observe(this, Observer {
            if(it){
                Toast.makeText(context,"Clearしました。",Toast.LENGTH_LONG).show()
                viewModel.onClearEvent.value=false
            }
        })
    }
}