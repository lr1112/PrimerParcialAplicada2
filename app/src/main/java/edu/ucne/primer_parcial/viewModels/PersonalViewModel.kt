package edu.ucne.primer_parcial.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.primer_parcial.dao.PersonalDao
import edu.ucne.primer_parcial.models.Personal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class PersonalViewModel @Inject constructor(
     val  personalDao: PersonalDao
) : ViewModel(){
        val personalList = MutableLiveData<List<Personal>>()
        var parametroBusqueda = MutableLiveData<String>()

        fun iniciar(){
                viewModelScope.launch {
                        personalList.value = withContext(Dispatchers.IO){
                                personalDao.insert(arrayListOf<Personal>())
                                Personal(0,"Luis", "Rosario","849-353-6691", "luisramonros123@gamil.com","Ingeniero")
                                personalDao.getAll()
                        }
                        for(personal in personalList.value !!){
                                Log.d("mensaje","id ${personal.personaId}, nombre ${personal.Nombre }")

                        }
                }
        }
}