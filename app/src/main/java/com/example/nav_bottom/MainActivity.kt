package com.example.nav_bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val HomeFragment=HomeActivity()
        val PesanFragment=PesanActivity()
        val ListFragment=ListActivity()

        setCurrentFragment(HomeFragment)
        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView

        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(HomeFragment)
                R.id.pesan->setCurrentFragment(PesanFragment)
                R.id.list->setCurrentFragment(ListFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,fragment)
            commit()
        }
    }
