package com.example.singleactivity


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_play.view.*

class PlayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_play, container, false)


        view.toNext.setOnClickListener { v ->

            if ((1..30).shuffled().last() % 2 == 0) {

                v.findNavController().navigate(R.id.action_playFragment_to_congratsFragment)
            } else {
                v.findNavController().navigate(R.id.action_playFragment_to_tryAgainFragment)
            }
        }

        return view
    }


}
