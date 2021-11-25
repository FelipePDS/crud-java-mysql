package br.com.loja.dal;

import java.sql.*;

public class ModuloConexao {
    public static Connection conectar() {
        Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/crud_java_mysql";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch(Exception ex) {
            return null;
        }
    }
}
