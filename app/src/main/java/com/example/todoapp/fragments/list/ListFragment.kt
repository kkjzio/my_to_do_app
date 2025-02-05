package com.example.todoapp.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentListBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {

//    private val mToDoViewModel: ToDoViewModel by viewModels()
//    private val mSharedViewModel: SharedViewModel by viewModels()
//
//    private var _binding: FragmentListBinding? = null
//    private val binding get() = _binding!!
//
//    private val adapter: ListAdapter by lazy { ListAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        view.findViewById<View>(R.id.floatingActionButton).setOnClickListener {
            // Handle the click
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }
//        view.findViewById<View>(R.id.floatingActionButton).setOnClickListener {
//            // Handle the click
//            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
//        }

        // menu
        setHasOptionsMenu(true)


        return view


//        // Data binding
//        _binding = FragmentListBinding.inflate(inflater, container, false)
//        binding.lifecycleOwner = this
//        binding.mSharedViewModel = mSharedViewModel
//
//        // Setup RecyclerView
//        setupRecyclerview()
//
//        // Observe LiveData
//        mToDoViewModel.getAllData.observe(viewLifecycleOwner) { data ->
//            mSharedViewModel.checkIfDatabaseEmpty(data)
//            adapter.setData(data)
//            binding.recyclerView.scheduleLayoutAnimation()
//        }
//
//        // Hide soft keyboard
//        hideKeyboard(requireActivity())
//
//        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_fragment_menu, menu)
    }
}