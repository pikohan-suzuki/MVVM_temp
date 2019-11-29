package com.amebaownd.pikohan_nwiatori.mvvm_temp.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.FragmentAddBinding
import com.amebaownd.pikohan_nwiatori.mvvm_temp.util.EventObserver
import com.amebaownd.pikohan_nwiatori.mvvm_temp.util.getViewModelFactory
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.AddViewModel

class AddFragment :Fragment(){

    private val viewModel : AddViewModel by viewModels{getViewModelFactory()}

    private lateinit var fragmentAddBinding: FragmentAddBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentAddBinding = FragmentAddBinding.inflate(inflater,container,false).apply {
            viewModel = this@AddFragment.viewModel
            lifecycleOwner = viewLifecycleOwner
        }

        return fragmentAddBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        endInsert()
        failedInsert()

    }

    private fun endInsert(){

    }

    private fun failedInsert(){

    }

    private fun navigateToList(){

    }
}