package edu.ucne.primer_parcial.dao

import androidx.room.*
import edu.ucne.primer_parcial.models.Prestamos


@Dao
interface PersonalDao {
    @Query("SELECT * FROM Prestamos")
    suspend fun getAll(): List<Prestamos>
    @Insert
    suspend fun insert(personas:List<Prestamos>)//:List<Int>
    @Update
    suspend fun update(personal: Prestamos):Int

    @Delete
    suspend fun delete(personal: Prestamos):Int


}