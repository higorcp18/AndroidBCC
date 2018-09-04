package ucb.br.aulalistview;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static ucb.br.aulalistview.R.drawable.uno;

public class VeiculoActivity extends Activity {

    TextView fabricante, modelo;
    ImageView imagemVeiculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculo);

        Veiculo veiculo = (Veiculo) getIntent().getSerializableExtra("veiculo");

        fabricante = findViewById(R.id.edtFabricante);
        modelo = findViewById(R.id.edtModelo);
        imagemVeiculo = findViewById(R.id.imgCarro);


        fabricante.setText(veiculo.getFabricante());
        modelo.setText(veiculo.getModelo());
        imagemVeiculo.setImageResource(veiculo.getImage());
    }
}
