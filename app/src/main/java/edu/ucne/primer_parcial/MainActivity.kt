package edu.ucne.primer_parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.primer_parcial.adaptador.AdaptadorPersonas
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

        binding.miRecyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
        }

        personalViewModel.personalList.observe(this, Observer {
            binding.miRecyclerView.adapter = AdaptadorPersonas(it)
        })
    }
}