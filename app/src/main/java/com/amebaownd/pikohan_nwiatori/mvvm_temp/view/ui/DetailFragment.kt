package com.amebaownd.pikohan_nwiatori.mvvm_temp.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.FragmentAddBinding
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.FragmentDetailBinding
import com.amebaownd.pikohan_nwiatori.mvvm_temp.util.getViewModelFactory
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.AddViewModel
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.DetailViewModel

class DetailFragment : Fragment(){
    private val viewModel : DetailViewModel by viewModels{getViewModelFactory()}

    private lateinit var fragmentDetailBinding: FragmentDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentDetailBinding = FragmentDetailBinding.inflate(inflater,container,false).apply {
            viewModel = this@DetailFragment.viewModel
            lifecycleOwner = viewLifecycleOwner
        }
        return fragmentDetailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}