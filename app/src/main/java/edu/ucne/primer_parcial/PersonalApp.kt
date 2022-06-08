package edu.ucne.primer_parcial

import android.app.Application
import androidx.room.Room
import edu.ucne.primer_parcial.data.PersonalDb


class PersonalApp: Application() {
    companion object{
        lateinit var db:PersonalDb
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            this,
            PersonalDb::class.java,
            "personal"
        ).build()

    }
}