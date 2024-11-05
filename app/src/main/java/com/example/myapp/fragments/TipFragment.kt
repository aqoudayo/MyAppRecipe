package com.example.myapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransitionImpl
import androidx.navigation.findNavController
import com.example.myapp.R
import com.example.myapp.contentsList.ContentsListActivity
import com.example.myapp.databinding.FragmentTipBinding


class TipFragment : Fragment() {

private lateinit var binding : FragmentTipBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater , R.layout.fragment_tip , container , false)

        binding.category1.setOnClickListener {
            val intent = Intent(context , ContentsListActivity::class.java)
            startActivity(intent)
        }

        binding.homeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_homeFragment)
        }
        binding.talkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_talkFragment)

        }
        binding.storeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_storeFragment)

        }
        binding.bookMarkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_bookMarkFragment)

        }

        return binding.root
    }


}