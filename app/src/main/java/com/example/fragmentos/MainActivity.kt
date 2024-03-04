package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()

        // Get the FragmentContainerView for the first fragment
        val fragmentContainerView = findViewById<FragmentContainerView>(R.id.fcv1)

        // Replace the fragment in the FragmentContainerView with the FirstFragment
        supportFragmentManager.beginTransaction()
            .replace(fragmentContainerView.id, firstFragment)
            .commit()
    }
}