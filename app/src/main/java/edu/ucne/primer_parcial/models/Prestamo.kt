package edu.ucne.primer_parcial.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Prestamo(
    @PrimaryKey(autoGenerate = true)
    val personaId:Int,
    val Nombre:String,
    val Apellido:String,
    val Telefono:String,
    val Correo:String,
    val prestado:String
)