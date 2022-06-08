package edu.ucne.primer_parcial.dao

import androidx.room.*
import edu.ucne.primer_parcial.models.Personal


@Dao
interface PersonalDao {
    @Query("SELECT * FROM Personal")
    suspend fun getAll(): List<Personal>
    @Insert
    suspend fun insert(personas:List<Personal>)//:List<Int>
    @Update
    suspend fun update(personal: Personal):Int

    @Delete
    suspend fun delete(personal: Personal):Int


}