package com.example.myapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.myapp.R
import com.example.myapp.databinding.FragmentBookMarkBinding
import com.example.myapp.databinding.FragmentTalkBinding


class BookMarkFragment : Fragment() {
    private lateinit var binding: FragmentBookMarkBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_book_mark ,container , false)

        binding.homeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookMarkFragment_to_homeFragment)
        }
        binding.goodTip.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookMarkFragment_to_tipFragment)

        }
        binding.storeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookMarkFragment_to_storeFragment)

        }
        binding.talkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_bookMarkFragment_to_talkFragment)

        }
        return binding.root
    }


}