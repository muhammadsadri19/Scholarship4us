package org.d3if3031.mystartup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout


class Beranda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val btnmember = findViewById<LinearLayout>(R.id.btnMember)
        btnmember.setOnClickListener{
            val intent = Intent(this, MemberDivisi::class.java)
            startActivity(intent)
        }
    }
}