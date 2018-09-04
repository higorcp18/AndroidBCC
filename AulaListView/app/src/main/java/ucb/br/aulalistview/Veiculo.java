package ucb.br.aulalistview;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Veiculo implements Serializable {

    private String fabricante;
    private String modelo;
    private int image;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}
