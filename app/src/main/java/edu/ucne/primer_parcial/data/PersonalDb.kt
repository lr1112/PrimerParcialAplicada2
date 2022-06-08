package edu.ucne.primer_parcial.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.primer_parcial.dao.PersonalDao
import edu.ucne.primer_parcial.models.Prestamos


@Database(
    entities = [Prestamos::class],
    version = 1
)
abstract class PersonalDb: RoomDatabase() {
    abstract fun personalDao(): PersonalDao

}