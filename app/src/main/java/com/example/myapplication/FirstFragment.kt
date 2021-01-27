package com.example.myapplication

import androidx.fragment.app.Fragment


class FirstFragment : Fragment(R.layout.fragment_first) {

    companion object {
        fun newInstance() = FirstFragment()
    }
}