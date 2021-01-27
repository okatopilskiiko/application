package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.main_browse_fragment, FirstFragment.newInstance())
                .commit()
    }

    fun openSecond() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_browse_fragment, SecondFragment.newInstance())
                .addToBackStack("stack")
                .commit()
    }

}