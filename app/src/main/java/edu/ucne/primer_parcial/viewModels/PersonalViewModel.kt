package edu.ucne.primer_parcial.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.primer_parcial.PersonalApp.Companion.db
import edu.ucne.primer_parcial.dao.PersonalDao
import edu.ucne.primer_parcial.models.Personal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject



class PersonalViewModel: ViewModel(){

        val personalList = MutableLiveData<List<Personal>>()
        var parametroBusqueda = MutableLiveData<String>()

        fun iniciar(){
                viewModelScope.launch {
                        personalList.value = withContext(Dispatchers.IO){
                               db.personalDao().insert(arrayListOf<Personal>(
                                Personal(0,"Luis", "Rosario","849-353-6691", "luisramonros123@gamil.com","Ingeniero"),
                                Personal(0,"Alberto", "Matias","849-353-6691", "amatias@gamil.com","maestro")
                                ))
                                db.personalDao().getAll()
                        }

                }
        }
}