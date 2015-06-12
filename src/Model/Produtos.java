package Model;

public class Produtos {
        int ID_Produtos;
        String descricao;
        float preco;

    public Produtos(int ID_Produtos, String descricao, float preco) {
        this.ID_Produtos = ID_Produtos;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produtos(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getID_Produtos() {
        return ID_Produtos;
    }

    public void setID_Produtos(int ID_Produtos) {
        this.ID_Produtos = ID_Produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}