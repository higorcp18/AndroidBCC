package ucb.br.aulagridview;

public class Venda {
    private int image;
    private String descricao;

    public Venda(int image, String descricao) {
        this.image = image;
        this.descricao = descricao;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
