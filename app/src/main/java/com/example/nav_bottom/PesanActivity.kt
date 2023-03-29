package com.example.nav_bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nav_bottom.databinding.FragmentPesanActivityBinding


class PesanActivity : Fragment() {


        lateinit var binding: FragmentPesanActivityBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment

            binding = FragmentPesanActivityBinding.inflate(layoutInflater,container,false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.buttonHitung.setOnClickListener {
                val nama = binding.idNama.text.toString()
                val alamat = binding.idAlamat.text.toString()
                val jenis = binding.jenispaket.text.toString()
                val berat = binding.berat.text.toString().toInt()
                val bund = Bundle()
                val biaya = berat * 6000

                bund.putString("NAMA", nama)
                bund.putString("ALAMAT", alamat)
                bund.putString("JENIS", jenis)
                bund.putInt("BERAT", berat)
                bund.putInt("BIAYA", biaya)

            }

            binding.buttonClear.setOnClickListener{
                binding.idNama.setText("")
                binding.idAlamat.setText("")
                binding.jenispaket.setText("")
                binding.berat.setText("")
            }
        }


    }

