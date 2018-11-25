package uc15101520.ucb.br.borrowme

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView

class ListaEmprestimosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_emprestimos)

        val listView = findViewById<ListView>(R.id.listViewEmprestimo)

       // val redcolor = Color.parseColor("#FF0000")
        //listView.setBackgroundColor(redcolor)

        listView.adapter = ItemEmprestimoAdapter(this)

    }

    private class ItemEmprestimoAdapter(context: Context) : BaseAdapter(){

        private val mContext : Context

        init {
            mContext = context
        }

        //Quantidade de células
        override fun getCount(): Int {
            return 10
        }

        override fun getItemId(positon: Int): Long {
            return positon.toLong()
        }

        override fun getItem(position: Int): Any {
            return "Test Position"
        }


        override fun getView(positon: Int, convertView: View?, viewGroup: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(mContext)
            val dinamicView = layoutInflater.inflate(R.layout.dinamic_view_emprestimo, viewGroup, false)
            return  dinamicView
        }


    }
}
