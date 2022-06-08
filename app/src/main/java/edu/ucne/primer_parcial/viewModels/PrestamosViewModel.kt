package edu.ucne.primer_parcial.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.ucne.primer_parcial.PrestamosApp.Companion.db
import edu.ucne.primer_parcial.models.Prestamos
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class PrestamosViewModel: ViewModel(){

        val personalList = MutableLiveData<List<Prestamos>>()
        var parametroBusqueda = MutableLiveData<String>()

        fun iniciar(){
                viewModelScope.launch {
                        personalList.value = withContext(Dispatchers.IO){
                               db.personalDao().insert(arrayListOf<Prestamos>(
                                Prestamos(0,"Luis", "Rosario","849-353-6691", "luisramonros123@gamil.com","Ingeniero"),
                                Prestamos(0,"Alberto", "Matias","849-353-6691", "amatias@gamil.com","maestro")
                                ))
                                db.personalDao().getAll()
                        }

                }
        }
}