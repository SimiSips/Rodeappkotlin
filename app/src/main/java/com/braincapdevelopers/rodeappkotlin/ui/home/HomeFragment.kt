package com.braincapdevelopers.rodeappkotlin.ui.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.braincapdevelopers.rodeappkotlin.GeneralIssuesActivity
import com.braincapdevelopers.rodeappkotlin.PotholesIssues
import com.braincapdevelopers.rodeappkotlin.R
import com.braincapdevelopers.rodeappkotlin.RobotsIssues

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

        val generalbtn: Button = root.findViewById(R.id.button)
        generalbtn.setOnClickListener { view ->
            Log.d("btnSetup", "Selected")
            val intent = Intent (getActivity(), GeneralIssuesActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        val potholesbtn: Button = root.findViewById(R.id.button1)
        potholesbtn.setOnClickListener { view ->
            Log.d("btnSetup", "Selected")
            val intent = Intent (getActivity(), PotholesIssues::class.java)
            getActivity()?.startActivity(intent)
        }
        val robotsbtn: Button = root.findViewById(R.id.button2)
        robotsbtn.setOnClickListener { view ->
            Log.d("btnSetup", "Selected")
            val intent = Intent (getActivity(), RobotsIssues::class.java)
            getActivity()?.startActivity(intent)
        }
        return root
    }
}