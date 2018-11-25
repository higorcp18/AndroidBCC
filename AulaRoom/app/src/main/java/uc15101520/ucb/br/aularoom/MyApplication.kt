package uc15101520.ucb.br.aularoom

import android.app.Application
import android.arch.persistence.room.Room

class MyApplication : Application() {

    companion object {
        var dataBase : AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        dataBase = Room.databaseBuilder(this, AppDataBase::class.java, "my-db").allowMainThreadQueries().build()
    }
}