package edu.ucne.primer_parcial.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.primer_parcial.dao.PrestamoDao
import edu.ucne.primer_parcial.models.Prestamos


@Database(
    entities = [Prestamos::class],
    version = 1
)
abstract class PrestamosDb: RoomDatabase() {
    abstract fun personalDao(): PrestamoDao

}