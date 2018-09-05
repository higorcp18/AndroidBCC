package ucb.br.aulagridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends Activity {
    private List<Venda> vendas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        vendas = new ArrayList<Venda>();

        vendas.add( new Venda(R.drawable.texte, "teste"));
        vendas.add( new Venda(R.drawable.texte, "teste"));
        vendas.add( new Venda(R.drawable.texte, "teste"));
        vendas.add( new Venda(R.drawable.texte, "teste"));
        vendas.add( new Venda(R.drawable.texte, "teste"));




        GridView gridView = findViewById(R.id.gridViewVenda);
        GridViewCustom gridAdapter = new GridViewCustom(vendas,this);
        gridView.setAdapter(gridAdapter);

    }




}
