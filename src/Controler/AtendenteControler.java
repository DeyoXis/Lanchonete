package Controler;

import Model.Atendente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lanchonete.Util;

public class AtendenteControler {
        public void inserirAtendente(Atendente at) throws SQLException {
        try {
            
            Util util = new Util(); // inicializar a classe util
            Connection conexao = util.conecta();//utilizar o método conecta da classe util
                
            String sql = "INSERT INTO Atendente (Nome) VALUES (?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
           statement.setString(1,at.getNome());
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo funcionáario inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
public void selectAtendente()throws SQLException {
        try {
            String sql = "SELECT * FROM Atendente";
            Util util = new Util(); // inicializar a classe util
             Connection conexao = util.conecta();//utilizar o método conecta da classe util
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}
