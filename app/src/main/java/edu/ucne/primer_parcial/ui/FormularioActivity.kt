package edu.ucne.primer_parcial.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import edu.ucne.primer_parcial.MainActivity
import edu.ucne.primer_parcial.R
import edu.ucne.primer_parcial.data.Constantes
import edu.ucne.primer_parcial.databinding.ActivityFormularioBinding
import edu.ucne.primer_parcial.viewModels.FormularioViewModel

class FormularioActivity : AppCompatActivity() {
    lateinit var binding:ActivityFormularioBinding
    lateinit var viewModel: FormularioViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get()
        viewModel.operacion = intent.getStringExtra(Constantes.OPERANCION_KEY)!!
        binding.modelo = viewModel
        binding.lifecycleOwner = this
       /* viewModel.operacionExitosa.observe(this, Observer {
            if(it){
                mostrarMensaje("Operacion Exitosa")
                irAlInicio()
            }else{
                mostrarMensaje("Ocurrio un Error")
            }
        })*/
    }

   /* private fun irAlInicio() {
        val intent = Intent(applicationContext,MainActivity::class.java)
    }

    private fun mostrarMensaje(s: String) {
        Toast.makeText(applicationContext,s,Toast.LENGTH_LONG).show()
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
    }*/
}