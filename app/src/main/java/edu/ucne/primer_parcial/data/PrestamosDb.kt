package edu.ucne.primer_parcial.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.primer_parcial.dao.PrestamoDao
import edu.ucne.primer_parcial.models.Prestamo


@Database(
    entities = [Prestamo::class],
    version = 2
)
abstract class PrestamosDb: RoomDatabase() {
    abstract fun personalDao(): PrestamoDao

}