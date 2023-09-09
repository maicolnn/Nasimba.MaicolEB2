package DataAccess;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppException;


public class UsuarioDAC extends SqliteDatahelper {

   

    public ResultSet getClave() throws AppException  {
        String query =   " SELECT  clave "
                        +" FROM    MN_USUARIO"
                        
                        ;
        try {
            Connection conn = openConnection();         //     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            return stmt.executeQuery(query);     
        } 
        catch (SQLException e) {
            //System.out.println(sql);
            throw new AppException(e, getClass(), "getClave()");
        }
    }
        public ResultSet getUsuario() throws AppException  {
        String query =   " SELECT  usuario "
                        +" FROM    MN_USUARIO"
                        
                        ;
        try {
            Connection conn = openConnection();         //     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            return stmt.executeQuery(query);     
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getUsuario()");
        }
    }


    
}