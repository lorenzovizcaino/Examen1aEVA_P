package com.example.examen1aeva_p

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examen1aeva_p.databinding.ActivityMainBinding
import com.example.examen1aeva_p.databinding.ActivityRegistroBinding


class ActivityRegistro : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.boton.setOnClickListener {
            var booluser=false
            var boolpass=false
            var boolpassigual=false
            if(binding.usuario.text.toString().isEmpty()) showToast(getString(R.string.Elcampousuarioestavacio))
            else booluser=true

            if(binding.pass.text.toString().isEmpty()) showToast(getString(R.string.Elcampocontraseñaestavacio))
            else if(binding.pass.length()<6) showToast("El campo de la contraseña tiene que tener minimo 6 caracteres")
            else boolpass=true;

            if(binding.pass.text.toString().equals(binding.pass2.text.toString())) boolpassigual=true
            else showToast("La contraseña debe de ser igual")

            if(booluser && boolpass && boolpassigual){
               showToast("Se ha registrado el usuario")


            }

        }
    }
    private fun showToast(string: String) {
        Toast.makeText(this,string, Toast.LENGTH_SHORT).show()

    }
}