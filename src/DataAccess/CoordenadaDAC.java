package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Framework.AppException;

public class CoordenadaDAC extends SqliteDatahelper {


    public ResultSet GetAllData() throws AppException{
        String query =   "SELECT " +
        "a.id_arsenal AS arsenal_id, a.arsenal AS arsenal_texto, a.estado AS arsenal_estado, " +
        "c.id_coordenadatipo AS coordenadatipo_id, c.CoordenadaTipo AS coordenadatipo_texto, c.estado AS coordenadatipo_estado, " +
        "co.id_coordenadas AS coordenadas_id, co.Coordenada AS coordenadas_texto, co.estado AS coordenadas_estado, " +
        "h.id_horarios AS horarios_id, h.Horario AS horarios_texto, h.estado AS horarios_estado " +
        "FROM MN_ARSENAL AS a " +
        "JOIN MN_COORDENADA_TIPO AS c ON a.id_arsenal = c.id_coordenadatipo " +
        "JOIN MN_COORDENADAS AS co ON a.id_arsenal = co.id_coordenadas " +
        "JOIN MN_HORARIOS AS h ON a.id_arsenal = h.id_horarios";

        try{
            Connection conn = openConnection();
            Statement stmt  = conn.createStatement();
            return stmt.executeQuery(query);
        }
        catch(SQLException e){
            throw new AppException(e, getClass(),"getAllData");
        }
    
    }
    
}
