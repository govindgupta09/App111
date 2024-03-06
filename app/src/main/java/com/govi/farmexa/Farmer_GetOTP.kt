package com.govi.farmexa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.govi.farmexa.databinding.ActivityFarmerGetOtpBinding

class Farmer_GetOTP : AppCompatActivity() {

    lateinit var binding: ActivityFarmerGetOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFarmerGetOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetOtp.setOnClickListener {
            val intent = Intent(this, Farmer_fillOTP::class.java)
            startActivity(intent)
        }

    }
}