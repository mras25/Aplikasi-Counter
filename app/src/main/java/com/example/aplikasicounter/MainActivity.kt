package com.example.aplikasicounter

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplikasicounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.increamentBtn.setOnClickListener{
            binding.counterTv.text = increamentCounter().toString()
        }
        binding.decreamentBtn.setOnClickListener{
            binding.counterTv.text = decreaseCounter().toString()
        }

    }
    private fun increamentCounter(): Int{
        return ++counter
    }

    private fun decreaseCounter(): Int{
        if(counter > 0) {
            counter--
        } else {
            Toast.makeText(this,"nilai counter tidak bisa kurang dari nol", Toast.LENGTH_LONG).show()
        }
        return counter
    }
}