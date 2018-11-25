package uc15101520.ucb.br.aularoom

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(version=1, entities = arrayOf(Entities.User::class))
abstract class AppDataBase : RoomDatabase(){
    abstract fun userDao() : UserDao
}