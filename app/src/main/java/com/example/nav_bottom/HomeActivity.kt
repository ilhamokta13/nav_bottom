package com.example.nav_bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nav_bottom.databinding.FragmentHomeActivityBinding
import com.example.nav_bottom.databinding.FragmentListActivityBinding

class HomeActivity : Fragment() {
    lateinit var binding: FragmentHomeActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeActivityBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener{
            val username = binding. usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            val bund = Bundle()
            bund.putString("username", username )
            bund.putString("password", password)
        }
    }


}