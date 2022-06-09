package edu.ucne.primer_parcial.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.ucne.primer_parcial.PrestamosApp.Companion.db
import edu.ucne.primer_parcial.models.Prestamo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class PrestamosViewModel: ViewModel(){

        val personalList = MutableLiveData<List<Prestamo>>()
        var parametroBusqueda = MutableLiveData<String>()

        fun iniciar(){
                viewModelScope.launch {
                        personalList.value = withContext(Dispatchers.IO){
                               db.personalDao().insert(arrayListOf<Prestamo>(
                                Prestamo(0,"Luis", "Rosario","849-353-6691", "luisramonros123@gamil.com","500,000"),
                                Prestamo(0,"Enel", "Ramon","809-456-8877", "enelR@gamil.com","600,000")
                                ))
                                db.personalDao().getAll()
                        }

                }
        }
}