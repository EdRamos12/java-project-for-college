package conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edu
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciador_de_imoveis";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    
    private static Connection conn;
    
    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            
            return conn;
        } catch (SQLException e) {
            System.out.println("deu erro no baguio de mysql");
            e.printStackTrace();
            return null;
        }
    }
}
