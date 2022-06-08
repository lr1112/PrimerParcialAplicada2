package edu.ucne.primer_parcial

import android.app.Application
import androidx.room.Room
import edu.ucne.primer_parcial.data.PrestamosDb


class PrestamosApp: Application() {
    companion object{
        lateinit var db:PrestamosDb
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            this,
            PrestamosDb::class.java,
            "personal"
        ).build()

    }
}