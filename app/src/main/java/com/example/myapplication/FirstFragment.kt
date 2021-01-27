package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.openSecondButton).setOnClickListener {
            (activity as MainActivity).openSecond()
        }
    }

    override fun onResume() {
        super.onResume()

    }

    companion object {
        fun newInstance() = FirstFragment()
    }
}