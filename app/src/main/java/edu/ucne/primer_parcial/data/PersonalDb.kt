package edu.ucne.primer_parcial.data

import androidx.room.Database
import edu.ucne.primer_parcial.models.Personal


@Database(
    entities = [Personal::class],
    version = 1
)
class PersonalDb {

}