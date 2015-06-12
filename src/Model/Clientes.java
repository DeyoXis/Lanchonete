package Model;

public class Clientes {
        int ID_Clientes;
        String Nome, Telefone, CPF;

    public Clientes(int ID_Clientes, String Nome, String Telefone, String CPF) {
        this.ID_Clientes = ID_Clientes;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.CPF = CPF;
    }
    public Clientes(String Nome, String Telefone, String CPF) {
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.CPF = CPF;
    }
    
    public int getID_Clientes() {
        return ID_Clientes;
    }

    public void setID_Clientes(int ID_Clientes) {
        this.ID_Clientes = ID_Clientes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }     
}