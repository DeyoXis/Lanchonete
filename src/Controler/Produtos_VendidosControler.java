package Controler;

import Model.Produtos_Vendidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lanchonete.Util;

public class Produtos_VendidosControler {
            public void inserirProdutos_Vendidos(Produtos_Vendidos pv) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO Produtos_Vendidos (quantidade,Produtos_idProdutos) VALUES (?,?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setInt(1, Integer.parseInt(pv.getQuantidade()));
            statement.setInt(2, Integer.parseInt(pv.getQuantidade()));
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Nova quantidade inserida com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

public void selectProdutos_Vendidos()throws SQLException {
        try {
            String sql = "SELECT * FROM Produtos_Vendidos";
            Util util = new Util();
             Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String Quantidade = result.getString("quantidade");
                
                String output = "Produtos_Vendidos #%d: %s ";
                System.out.println(String.format(output, ++count, Quantidade));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    }