package edu.ucne.primer_parcial.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.ucne.primer_parcial.PrestamosApp.Companion.db
import edu.ucne.primer_parcial.data.Constantes
import edu.ucne.primer_parcial.models.Prestamo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FormularioViewModel: ViewModel() {
    var id = MutableLiveData<Int>()
    var nombre = MutableLiveData<String>()
    var apellido = MutableLiveData<String>()
    var telefono = MutableLiveData<String>()
    var correo = MutableLiveData<String>()
    var prestado = MutableLiveData<String>()
    var operacion = Constantes.OPERACION_INSERTAR
    var operacionExitosa = MutableLiveData<Boolean>()

    init {
        id.value = 0
    }

    fun guardarUsuario(){
        var mPrestamo = Prestamo(0,nombre.value!!,apellido.value!!,telefono.value!!,
        correo.value!!,prestado.value!!)
        when(operacion){
            Constantes.OPERACION_INSERTAR->{
                viewModelScope.launch {
                    val result = withContext(Dispatchers.IO){
                        db.personalDao().insert(
                            arrayListOf<Prestamo>(
                                mPrestamo
                            )
                        )
                    }
                    operacionExitosa.value = result.equals(true)
                }


            }
            Constantes.OPERACION_EDITAR->{

            }
        }

    }
}