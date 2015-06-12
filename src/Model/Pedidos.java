package Model;

public class Pedidos {
        int ID_Pedido;
        String Obs;

    public Pedidos(int ID_Pedido, String Obs) {
        this.ID_Pedido = ID_Pedido;
        this.Obs = Obs;
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
}