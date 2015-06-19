package Controler;

import Model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import lanchonete.Util;

public class ProdutosControler {
            public void inserirProduto(Produtos p) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO Produtos (descricao, preço) VALUES (?, ?)";
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
            
public Vector selectProdutos()throws SQLException {
                       Vector s =new Vector();

        try {
            String sql = "SELECT * FROM Produtos";
            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                  s.add(result.getString("descricao"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return s;
    }
    
    public int  getIdByNome(String descricao){
        int id=-1;
            try {
            Util util= new Util();
            Connection conexao = util.conecta();
            String sql= "Select ID_Produtos from Produtos where descricao like '"+descricao+"'";
                Statement statement = conexao.createStatement();
          ResultSet result = statement.executeQuery(sql);
           while (result.next()){               
               id=result.getInt("ID_Produtos");
            }
       } catch (SQLException ex) {
            Logger.getLogger(ProdutosControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}