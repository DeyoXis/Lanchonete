package Model;

public class Produtos_Vendidos {
        int id_Item, Produtos_idProdutos;
        String Quantidade;

    public Produtos_Vendidos (int id_Item, String Quantidade,int Produtos_idProdutos) {
        this.id_Item = id_Item;
        this.Quantidade = Quantidade;
        this.Produtos_idProdutos = Produtos_idProdutos;
    }

    public Produtos_Vendidos (String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getId_Item() {
        return id_Item;
    }

    public void setId_Item(int id_Item) {
        this.id_Item = id_Item;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    } 

    public int getProdutos_idProdutos() {
        return Produtos_idProdutos;
    }

    public void setProdutos_idProdutos(int Produtos_idProdutos) {
        this.Produtos_idProdutos = Produtos_idProdutos;
    }
}