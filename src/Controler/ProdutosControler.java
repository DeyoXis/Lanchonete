package Controler;

import Model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lanchonete.Util;

public class ProdutosControler {
            public void inserirProduto(Produtos p) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO pessoa (descricao, preço) VALUES (?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, p.getDescricao());
            statement.setFloat(2, p.getPreco());
            
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo produto inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

public void selectProdutos()throws SQLException {
        try {
            String sql = "SELECT * FROM produtos";
            Util util = new Util();
             Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                Float preco = result.getFloat("preco");
                String endereco = result.getString("endereco");
                
                String output = "Pessoa #%d: %s - %s ";
                System.out.println(String.format(output, ++count, preco, endereco));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}