package com.amebaownd.pikohan_nwiatori.mvvm_temp.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.amebaownd.pikohan_nwiatori.mvvm_temp.R
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_list.*

class AddFragment :Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goto_detail.setOnClickListener {
            val action = AddFragmentDirections
                .actionAddFragmentToDetailFragment()
            findNavController().navigate(action)
        }
    }
}