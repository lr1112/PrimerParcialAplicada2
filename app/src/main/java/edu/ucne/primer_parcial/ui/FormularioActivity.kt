package edu.ucne.primer_parcial.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
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
    }
}