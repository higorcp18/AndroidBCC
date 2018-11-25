package uc15101520.ucb.br.primeiraaulakotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    var token = String()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOk.setOnClickListener {
            getToken()
        }

        btnUser.setOnClickListener{
            getUser()
        }
    }

    private fun getToken() {

        val queue = Volley.newRequestQueue(this@MainActivity)
        val postRequest = object : StringRequest(Request.Method.POST, "http://www.wisecode.net/aula_android/token", Response.Listener<String>
        {
            response ->  Toast.makeText(this,response.toString(), Toast.LENGTH_LONG).show()
            val token = response.toString()
            var json = JSONObject(token).get("access_token")
            this.token = json.toString()
            //SharedPrefs().setDeviceID(applicationContext,API_KEY+json)
            //Log.d(TAG,"TOKEN-ACESSO-API: " + API_KEY+json)


        }, Response.ErrorListener {
            Toast.makeText(this, "Deu Ruim", Toast.LENGTH_LONG).show()
        }
        ) {
            override fun getParams(): Map<String, String> {
                //Creating HashMap
                val params = HashMap<String, String>()

                params.put("username", "aulaandroid")
                params.put("password", "123456")
                params.put("grant_type", "password")
                return params
            }
        }
        queue.add(postRequest)
    }

    private fun getUser(){
        val api_key = "bearer " + token.toString()

        val url = "http://www.wisecode.net/aula_android/api/usuario"

        val queue = Volley.newRequestQueue(this)

        val stringRequest = object : StringRequest(Request.Method.GET, url,
                Response.Listener { response ->
                    Toast.makeText(this, response.toString(), Toast.LENGTH_LONG).show()
                },
                Response.ErrorListener { Toast.makeText(this, "Deu Ruim", Toast.LENGTH_LONG).show() }) {
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["Authorization"] = api_key
                return headers
            }
        }
        queue.add(stringRequest)
    }


}
