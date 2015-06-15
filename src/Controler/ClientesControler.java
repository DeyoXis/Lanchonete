package Controler;

import Model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lanchonete.Util;

public class ClientesControler {
        public void inserirClientes(Clientes c) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO Clientes (nome, telefone, cpf) VALUES (?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, c.getNome());
            statement.setString(2, c.getTelefone());
            statement.setString(3, c.getCPF());
             
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
        public void selectPessoa()throws SQLException {
        try {
            String sql = "SELECT * FROM Cliente";
            Util util = new Util();
             Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String nome = result.getString("nome");
                String CPF = result.getString("CPF");
                String Telefone = result.getString("Telefone");
                                
                String output = "Pessoa #%d: %s - %s - %s ";
                System.out.println(String.format(output, ++count, nome,CPF, Telefone));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}