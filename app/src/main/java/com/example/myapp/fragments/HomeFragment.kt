package com.example.myapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.myapp.R
import com.example.myapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_home , container , false)

        binding.goodTip.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_tipFragment)
        }
        binding.talkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_talkFragment)

        }
        binding.bookMarkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_bookMarkFragment)

        }
        binding.storeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_storeFragment)

        }

        return binding.root
    }


}