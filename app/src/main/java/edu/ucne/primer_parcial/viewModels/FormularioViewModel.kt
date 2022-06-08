package edu.ucne.primer_parcial.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.ucne.primer_parcial.data.Constantes

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
        when(operacion){
            Constantes.OPERACION_INSERTAR->{
                //todo logica para insertar en la db
                Log.d("mensaje", "nombre ${nombre.value}")
                Log.d("mensaje", "correo ${correo.value}")

            }
            Constantes.OPERACION_EDITAR->{

            }
        }

    }
}