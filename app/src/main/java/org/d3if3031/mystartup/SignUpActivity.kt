package org.d3if3031.mystartup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Toast
import org.d3if3031.mystartup.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var Username: String
    private lateinit var Email: String
    private lateinit var Phone: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_up)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener{
            Username = binding.tfUserName.text.toString()
            Email = binding.tfemail.text.toString()
            Phone = binding.tfphone.text.toString()

            val intent = Intent(this, DataProfile::class.java)
            intent.putExtra("Username", Username)
            intent.putExtra("Email", Email)
            intent.putExtra("Phone", Phone)
            startActivity(intent)

        }
    }
}