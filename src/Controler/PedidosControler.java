package Controler;

import Model.Pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lanchonete.Util;

public class PedidosControler {
            public void inserirPedido(Pedidos p) throws SQLException {
            try {
            Util util = new Util();
             Connection conexao = util.conecta();
            String sql = "INSERT INTO Pedido (Obs) VALUES (?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, p.getObs());
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo pedido inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

public void selectPedidos()throws SQLException {
        try {
            String sql = "SELECT * FROM Pedido";
            Util util = new Util();
             Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String Obs = result.getString("Obs");
                int Clientes_idClientes = result.getInt ("Clientes_idClientes");
                int Atendente_idAtendente = result.getInt ("Atendente_idAtendente");
                int Produtos_Vendidos_id_Item = result.getInt("Produtos_Vendidos_id_Produtos");
                int Mesas_idMesas = result.getInt("Mesas_idMesas");
                
                String output = "Pedido #%d: %s";
                System.out.println(String.format(output, ++count, Obs, Clientes_idClientes, Atendente_idAtendente, Produtos_Vendidos_id_Item, Mesas_idMesas));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }


}