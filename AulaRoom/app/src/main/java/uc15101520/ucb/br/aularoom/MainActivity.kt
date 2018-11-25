package uc15101520.ucb.br.aularoom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Entities.User(1,"Julio")

        MyApplication.dataBase?.userDao()?.insertUsers(user)

//        MyApplication.dataBase?.userDao()?.updateUser(user)
//
//        MyApplication.dataBase?.userDao()?.deleteUser(user)

        var resultado = MyApplication.dataBase?.userDao()?.getAllUsers()


    }
}
