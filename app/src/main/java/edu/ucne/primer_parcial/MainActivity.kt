package edu.ucne.primer_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import edu.ucne.primer_parcial.adaptador.AdaptadorPrestamo
import edu.ucne.primer_parcial.data.Constantes
import edu.ucne.primer_parcial.databinding.ActivityMainBinding
import edu.ucne.primer_parcial.ui.FormularioActivity
import edu.ucne.primer_parcial.viewModels.PrestamosViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: PrestamosViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       viewModel =  ViewModelProvider(this).get()
       viewModel.iniciar()

        binding.miRecyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
        }

        viewModel.personalList.observe(this, Observer {
            binding.miRecyclerView.adapter = AdaptadorPrestamo(it)
        })

        binding.btnAbrirFormulario.setOnClickListener {
            val intent = Intent(this, FormularioActivity::class.java)
            intent.putExtra(Constantes.OPERANCION_KEY,Constantes.OPERACION_INSERTAR)
            startActivity(intent)
        }
    }

}