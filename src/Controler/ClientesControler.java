package Controler;

import Model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import lanchonete.Util;

public class ClientesControler {
        public void inserirClientes(Clientes c) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO Clientes (nome, telefone, cpf) VALUES (?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, c.getNome_cliente());
            statement.setString(2, c.getTelefone_cliente());
            statement.setString(3, c.getCPF_cliente());
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo cliente inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
       public Vector selectPessoa()throws SQLException {
                    Vector s =new Vector();
        try {
            String sql = "SELECT * FROM Clientes";
            Util util = new Util();
             Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String nome = result.getString("nome");
                String CPF = result.getString("CPF");
                String Telefone = result.getString("Telefone");
                                
                String output = "Clientes #%d: %s - %s - %s ";
                System.out.println(String.format(output, ++count, nome,CPF, Telefone));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return s;
    }
       
        
        public int  getIdByNome_Cliente(String Nome){
        int id=-1;
            try {
            Util util= new Util();
            Connection conexao = util.conecta();
            String sql= "Select ID_Clientes from Produtos where descricao like '"+Nome+"'";
                Statement statement = conexao.createStatement();
          ResultSet result = statement.executeQuery(sql);
           while (result.next()){               
               id=result.getInt("ID_Clientes");
            }
       } catch (SQLException ex) {
            Logger.getLogger(ProdutosControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
