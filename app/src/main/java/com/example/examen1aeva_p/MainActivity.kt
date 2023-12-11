package com.example.examen1aeva_p

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examen1aeva_p.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.boton.setOnClickListener {
            var booluser=false
            var boolpass=false
            if(binding.usuario.text.toString().isEmpty()) showToast(getString(R.string.Elcampousuarioestavacio))
            else booluser=true

            if(binding.pass.text.toString().isEmpty()) showToast(getString(R.string.Elcampocontraseñaestavacio))
            else if(binding.pass.length()<6) showToast("El campo de la contraseña tiene que tener minimo 6 caracteres")
            else boolpass=true;

            if(booluser && boolpass){
                val intent = Intent(this, MainActivity2::class.java)

                intent.putExtra("usuario", binding.usuario.text.toString())

                startActivity(intent)


            }

        }
        binding.labelregistrarse.setOnClickListener{
            val intent = Intent(this, ActivityRegistro::class.java)

            startActivity(intent)
        }





    }

    private fun showToast(string: String) {
        Toast.makeText(this,string, Toast.LENGTH_SHORT).show()

    }
}