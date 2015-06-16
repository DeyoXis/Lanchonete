package Model;

public class Clientes {
        int ID_Clientes;
        String Nome_cliente, Telefone_cliente, CPF_cliente;

    public Clientes(int ID_Clientes, String Nome_cliente, String Telefone_cliente, String CPF_cliente) {
        this.ID_Clientes = ID_Clientes;
        this.Nome_cliente = Nome_cliente;
        this.Telefone_cliente = Telefone_cliente;
        this.CPF_cliente = CPF_cliente;
    }

    public Clientes(String Nome_cliente, String Telefone_cliente, String CPF_cliente) {
        this.Nome_cliente = Nome_cliente;
        this.Telefone_cliente = Telefone_cliente;
        this.CPF_cliente = CPF_cliente;
    }

    public int getID_Clientes() {
        return ID_Clientes;
    }

    public void setID_Clientes(int ID_Clientes) {
        this.ID_Clientes = ID_Clientes;
    }

    public String getNome_cliente() {
        return Nome_cliente;
    }

    public void setNome_cliente(String Nome_cliente) {
        this.Nome_cliente = Nome_cliente;
    }

    public String getTelefone_cliente() {
        return Telefone_cliente;
    }

    public void setTelefone_cliente(String Telefone_cliente) {
        this.Telefone_cliente = Telefone_cliente;
    }

    public String getCPF_cliente() {
        return CPF_cliente;
    }

    public void setCPF_cliente(String CPF_cliente) {
        this.CPF_cliente = CPF_cliente;
    }

}