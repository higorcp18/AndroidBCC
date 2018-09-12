package ucb.br.aulagridview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends Activity implements AdapterView.OnItemClickListener{
    private List<Venda> vendas;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        vendas = new ArrayList<Venda>();

        vendas.add( new Venda(R.drawable.map, "teste"));
        vendas.add( new Venda(R.drawable.mobile_phone, "teste"));
        vendas.add( new Venda(R.drawable.web, "teste"));
        vendas.add( new Venda(R.drawable.conversation, "teste"));


        GridView gridView = findViewById(R.id.gridViewVenda);
        GridViewCustom gridAdapter = new GridViewCustom(vendas,this);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;
        switch (i)
        {
            case 0:
                intent = new Intent();
                uri = Uri.parse("geo:47.6,-122.3");
                intent.setData(uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
            case 1:
                intent = new Intent();
                uri = Uri.parse("tel:"+"99909039");
                intent.setAction(intent.ACTION_DIAL);
                intent.setData(uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
            case 2:
                intent = new Intent();
                uri = Uri.parse("http:www.ucb.br");
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
            case 3:
                intent = new Intent();
                intent.setAction(intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_TEXT, "Ola mundo");
                intent.setType("text/plain");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
        }
    }
}
