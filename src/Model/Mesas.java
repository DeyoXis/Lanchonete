package Model;

public class Mesas {
        int ID_Mesas;
        String Descricao;

    public Mesas(int ID_Mesas, String Descricao) {
        this.ID_Mesas = ID_Mesas;
        this.Descricao = Descricao;
    }

    public Mesas(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getID_Mesas() {
        return ID_Mesas;
    }

    public void setID_Mesas(int ID_Mesas) {
        this.ID_Mesas = ID_Mesas;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }          
}