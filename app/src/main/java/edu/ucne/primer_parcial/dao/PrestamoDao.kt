package edu.ucne.primer_parcial.dao

import androidx.room.*
import edu.ucne.primer_parcial.models.Prestamo


@Dao
interface PrestamoDao {
    @Query("SELECT * FROM Prestamo")
    suspend fun getAll(): List<Prestamo>
    @Insert
    suspend fun insert(personas:List<Prestamo>):List<Long>
    @Update
    suspend fun update(personal: Prestamo):Int

    @Delete
    suspend fun delete(personal: Prestamo):Int


}