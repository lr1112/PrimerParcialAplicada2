package edu.ucne.primer_parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.primer_parcial.databinding.ActivityMainBinding
import edu.ucne.primer_parcial.viewModels.PersonalViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    private val personalViewModel: PersonalViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       personalViewModel.iniciar()
    }
}