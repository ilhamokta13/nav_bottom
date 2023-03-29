package com.example.nav_bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nav_bottom.databinding.FragmentListActivityBinding

class ListActivity : Fragment() {

    lateinit var binding: FragmentListActivityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListActivityBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getnama = arguments?.getString("NAMA")
        val getalamat = arguments?.getString("ALAMAT")
        val getjenis = arguments?.getString("JENIS")
        val getberat = arguments?.getInt("BERAT")
        val getbiaya = arguments?.getInt("BIAYA")

        binding.txtNama.setText(getnama)
        binding.txtAlamat.setText(getalamat)
        binding.txtjenis.setText(getjenis)
        if (getberat != null) {
            binding.txtberat.setText(getberat)
        }

        if (getbiaya != null) {
            binding.txtharga.setText(getbiaya)
        }



    }



}