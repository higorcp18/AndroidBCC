package ucb.br.aulalistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    //ListView listView;
    ArrayAdapter arrayAdapter;
    Intent intent;
    Veiculo[] veiculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        veiculos = new Veiculo[5];
        populaVeiculos();

        //arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.arrayCarros));

        ListView listView = findViewById(R.id.lista);
        VeiculoAdapter veiculoAdapter = new VeiculoAdapter();
        listView.setAdapter(veiculoAdapter);

        //listView = findViewById(R.id.lista);
        //listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intent = new Intent(this, VeiculoActivity.class);
        intent.putExtra("veiculo", veiculos[i]);
        startActivity(intent);
    }

    public void populaVeiculos(){
        Veiculo veiculo = new Veiculo();
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();
        Veiculo veiculo4 = new Veiculo();

        veiculo.setModelo("Uno");
        veiculo.setFabricante("Fiat");
        veiculo.setImage(R.drawable.uno);
        veiculos[0] = veiculo;

        veiculo1.setModelo("Palio");
        veiculo1.setFabricante("Fiat");
        veiculo1.setImage(R.drawable.palio);
        veiculos[1] = veiculo1;

        veiculo2.setModelo("Gol");
        veiculo2.setFabricante("Volkswagem");
        veiculo2.setImage(R.drawable.gol);
        veiculos[2] = veiculo2;

        veiculo3.setModelo("Fusion");
        veiculo3.setFabricante("Ford");
        veiculo3.setImage(R.drawable.fusion);
        veiculos[3] = veiculo3;

        veiculo4.setModelo("Fusca");
        veiculo4.setFabricante("Volkswagem");
        veiculo4.setImage(R.drawable.fusca);
        veiculos[4] = veiculo4;

        //Layout OLX
    }

    class VeiculoAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return veiculos.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.listviewcell, null);

            ImageView imgVeiculo = view.findViewById(R.id.imageVeiculo);
            TextView tvFabricante = view.findViewById(R.id.tvFabricante);
            TextView tvModelo = view.findViewById(R.id.tvModelo);

            imgVeiculo.setImageResource(veiculos[i].getImage());
            tvFabricante.setText(veiculos[i].getFabricante());
            tvModelo.setText(veiculos[i].getModelo());

            return view;
        }
    }


}
