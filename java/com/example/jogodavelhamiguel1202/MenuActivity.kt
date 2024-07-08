package com.example.jogodavelhamiguel1202

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.JogoDaVelhaMIGUEL1202.MainActivity
import com.example.JogoDaVelhaMIGUEL1202.databinding.ActivityMenuBinding
import com.example.jogodavelha.JogadorActivity

class MenuActivity : AppCompatActivity () {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonMaquina.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        binding.buttonJogo.setOnClickListener {
            val i = Intent(this, JogadorActivity::class.java)
            startActivity(i)
        }
    }
}