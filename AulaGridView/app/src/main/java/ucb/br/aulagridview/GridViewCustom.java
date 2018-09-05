package ucb.br.aulagridview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class GridViewCustom extends BaseAdapter{
    List<Venda> vendas;
    Context context;

    public GridViewCustom(List<Venda> vendas, Context context) {
        this.vendas = vendas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return vendas.size();
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

        view = LayoutInflater.from(this.context).inflate(R.layout.grid_custom_view, null);

        ImageView image = view.findViewById(R.id.imageView);
        image.setImageResource(vendas.get(i).getImage());

        return view;
    }
}
