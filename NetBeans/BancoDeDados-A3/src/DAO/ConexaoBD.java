package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public Connection conectaBD() throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/dbsistema", "root", "");          
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados nao localizado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: "+ ex.getMessage());
        } 
        return conexao;     
    }    
}
