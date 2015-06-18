package Controler;

import Model.Mesas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lanchonete.Util;

public class MesasControler {
            public void inserirMesa(Mesas m) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO Mesas (Descricao) VALUES (?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, m.getDescricao());
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Nova mesa inserida com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

public void selectMesas()throws SQLException {
        try {
            String sql = "SELECT * FROM Mesas";
            Util util = new Util();
             Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String Descricao = result.getString("Descricao");
                
                String output = "Mesas #%d: %s";
                System.out.println(String.format(output, ++count, Descricao));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}