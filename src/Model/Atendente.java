package Model;

public class Atendente {
        int ID_Atendente;
        String Nome;

    public Atendente(int ID_Atendente, String Nome) {
        this.ID_Atendente = ID_Atendente;
        this.Nome = Nome;
    }

    public Atendente(String Nome) {
        this.Nome = Nome;
    }

    public int getID_Atendente() {
        return ID_Atendente;
    }

    public void setID_Atendente(int ID_Atendente) {
        this.ID_Atendente = ID_Atendente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
        
        
}
