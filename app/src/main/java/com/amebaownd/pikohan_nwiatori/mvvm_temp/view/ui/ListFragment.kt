package com.amebaownd.pikohan_nwiatori.mvvm_temp.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.FragmentListBinding
import com.amebaownd.pikohan_nwiatori.mvvm_temp.util.EventObserver
import com.amebaownd.pikohan_nwiatori.mvvm_temp.util.getViewModelFactory
import com.amebaownd.pikohan_nwiatori.mvvm_temp.view.adapter.MemoListAdapter
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.ListViewModel

class ListFragment : Fragment(){
    private val viewModel : ListViewModel by viewModels{getViewModelFactory()}
    private lateinit var adapter : MemoListAdapter

    private lateinit var fragmentListBinding: FragmentListBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentListBinding = FragmentListBinding.inflate(inflater,container,false).apply {
            viewModel = this@ListFragment.viewModel
            lifecycleOwner = viewLifecycleOwner
        }
        return fragmentListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        viewModel.start()
        viewModel.onAddEvent.observe(this,EventObserver{
            if(it){
                navigateToAddFragment()
            }
        })
        viewModel.openDetailEvent.observe(this,EventObserver{
            if(it != ""){
                navigateToDetailFragment(it)
            }
        })
    }

    private fun navigateToAddFragment(){
        val action = ListFragmentDirections
            .actionListFragmentToAddFragment()
        findNavController().navigate(action)
    }
    private fun navigateToDetailFragment(memoId:String){
        val action = ListFragmentDirections
            .actionListFragmentToDetailFragment(memoId)
        findNavController().navigate(action)
    }

    private fun setupRecyclerView(){
        val viewModel = fragmentListBinding.viewModel
        if(viewModel!=null) {
            adapter = MemoListAdapter(viewModel, view?.context)
            fragmentListBinding.listRecyclerView.adapter = adapter
            fragmentListBinding.listRecyclerView.addItemDecoration(
                DividerItemDecoration(
                    this.context,
                    DividerItemDecoration.VERTICAL
                )
            )
        }
    }
}