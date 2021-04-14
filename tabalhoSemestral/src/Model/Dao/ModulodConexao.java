package Model.Dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author Lenovo
 */import java.sql.*;
public class ModulodConexao {
// metodo para estabelecer a conexao ao banco de dados
   public static Connection conector(){
   java.sql.Connection conexao = null;
   // a linha abaixo chama o driver de conexao
   String driver ="com.mysql.jdbc.Driver";
   //armazenando dados recentes no banco de dados
   String url = "jdbc:mysql://localhost:3306/consultoria";
   String user = "root";
   String password = "";
   //estabelecendo a conexao com o banco de dados
       try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url,user,password);
           return conexao;
       } catch (Exception e) {
           System.out.print(e);
           return null;
       }
   }
    
}
