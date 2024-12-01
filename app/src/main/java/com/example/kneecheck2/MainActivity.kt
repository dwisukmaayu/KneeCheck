package com.example.kneecheck2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kneecheck.ui.dashboard.DashboardFragment
import com.example.kneecheck.ui.histori.HistoriFragment
import com.example.kneecheck.ui.profile.ProfileFragment
import com.example.kneecheck.ui.scan.ScanFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Default fragment saat aplikasi dibuka
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, DashboardFragment())
            .commit()

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_dashboard -> {
                    // Pindah ke DashboardFragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, DashboardFragment())
                        .commit()
                    true
                }
                R.id.navigation_scan -> {
                    // Pindah ke CameraFragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, ScanFragment())
                        .commit()
                    true
                }
                R.id.navigation_histori -> {
                    // Pindah ke CameraFragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, HistoriFragment())
                        .commit()
                    true
                }
                R.id.navigation_profile -> {
                    // Pindah ke ProfileFragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, ProfileFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}
