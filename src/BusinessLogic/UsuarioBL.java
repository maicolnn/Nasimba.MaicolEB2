package BusinessLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.Usuario;
import DataAccess.UsuarioDAC;
import Framework.AppException;

public class UsuarioBL {
 

    public List<Usuario> getUsuario() throws AppException{
        try {
            UsuarioDAC UsuarioDAC = new UsuarioDAC(); 
            List<Usuario> lstUsuario = new ArrayList<Usuario>();

            ResultSet rs =  UsuarioDAC.getClave();
            while(rs.next())    {
                Usuario u = new Usuario(  rs.getInt(   "Usuario_id"),
                                    rs.getString("usuario"),
                                    rs.getString("clave")); 
                lstUsuario.add(u);
            }
            return lstUsuario; 
        } 
        catch (Exception e) {
            throw new AppException(e, getClass(),"GetUsuario");
        }
    } 
    
   


    
}
