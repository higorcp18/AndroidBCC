package uc15101520.ucb.br.aularoom

import android.arch.persistence.room.*

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAllUsers(): List<Entities.User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUsers(vararg users: Entities.User)

    @Update
    fun updateUser(user: Entities.User)

    @Delete
    fun deleteUser(user: Entities.User)
}