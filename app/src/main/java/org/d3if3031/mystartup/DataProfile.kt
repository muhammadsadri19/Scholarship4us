package org.d3if3031.mystartup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import org.d3if3031.mystartup.databinding.ActivityDataProfileBinding

class DataProfile : AppCompatActivity() {
    private lateinit var binding: ActivityDataProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data_profile)
        binding = ActivityDataProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("Username")
        binding.tvUsername.text = username
        val email = intent.getStringExtra("Email")
        binding.tvEmail.text = email
        val phone = intent.getStringExtra("Phone")
        binding.tvPhone.text = phone

    }
}