package Model;

public class Pedidos {
        int ID_Pedido, Clientes_idClientes, Atendente_idAtendente, Produtos_Vendidos_id_Item, Mesas_idMesas;
        String Obs;

    public Pedidos(int ID_Pedido, String Obs, int Clientes_idClientes, int Atendente_idAtendente, int Produtos_Vendidos_id_Item, int Mesas_idMesas) {
        this.ID_Pedido = ID_Pedido;
        this.Obs = Obs;
        this.Clientes_idClientes = Clientes_idClientes;
        this.Atendente_idAtendente = Atendente_idAtendente;
        this.Produtos_Vendidos_id_Item = Produtos_Vendidos_id_Item;
        this.Mesas_idMesas = Mesas_idMesas;
    }

    public Pedidos(String Obs) {
        this.Obs = Obs;
    }

    public int getID_Pedido() {
        return ID_Pedido;
    }

    public void setID_Pedido(int ID_Pedido) {
        this.ID_Pedido = ID_Pedido;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }      

    public int getClientes_idClientes() {
        return Clientes_idClientes;
    }

    public void setClientes_idClientes(int Clientes_idClientes) {
        this.Clientes_idClientes = Clientes_idClientes;
    }

    public int getAtendente_idAtendente() {
        return Atendente_idAtendente;
    }

    public void setAtendente_idAtendente(int Atendente_idAtendente) {
        this.Atendente_idAtendente = Atendente_idAtendente;
    }

    public int getProdutos_Vendidos_id_Item() {
        return Produtos_Vendidos_id_Item;
    }

    public void setProdutos_Vendidos_id_Item(int Produtos_Vendidos_id_Item) {
        this.Produtos_Vendidos_id_Item = Produtos_Vendidos_id_Item;
    }

    public int getMesas_idMesas() {
        return Mesas_idMesas;
    }

    public void setMesas_idMesas(int Mesas_idMesas) {
        this.Mesas_idMesas = Mesas_idMesas;
    }
}