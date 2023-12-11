package com.example.examen1aeva_p

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.URLUtil
import android.widget.Toast
import com.example.examen1aeva_p.databinding.ActivityMain2Binding
import com.example.examen1aeva_p.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var user=intent.getStringExtra("usuario")
        var contador1=0
        var contador2=0
        var contadort=0
        println(user)
        binding.usuario.text=user

        binding.boton1.setOnClickListener {
                contador1=binding.contador1.text.toString().toInt()+1
                binding.contador1.text=contador1.toString()

                contadort=contador1+contador2
                binding.contadort.text=contadort.toString()

        }

        binding.boton2.setOnClickListener {
            contador2=binding.contador2.text.toString().toInt()+1
            binding.contador2.text=contador2.toString()

            contadort=contador1+contador2
            binding.contadort.text=contadort.toString()

        }
        binding.eliminar1.setOnClickListener {
            contador1=binding.contador1.text.toString().toInt()-1
            binding.contador1.text=contador1.toString()

            contadort=contador1+contador2
            binding.contadort.text=contadort.toString()
        }

        binding.eliminar2.setOnClickListener {
            contador1=binding.contador1.text.toString().toInt()-1
            binding.contador1.text=contador1.toString()

            contadort=contador1+contador2
            binding.contadort.text=contadort.toString()
        }
    }

    //menu desde aqui
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menumain2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId==R.id.acerca_de){
           // showToast(getString(R.string.autor))
            showToast("Manuel Antonio Lorenzo Vizcaino")
        }

        return true
    }


    //menu hasta aqui

    private fun showToast(string: String) {
        Toast.makeText(this,string, Toast.LENGTH_SHORT).show()

    }
}