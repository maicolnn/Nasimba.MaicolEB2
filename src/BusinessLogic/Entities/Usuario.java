
package BusinessLogic.Entities;

public class Usuario {
    private Integer id;
    private String usuario;
    private String clave;

    public Usuario(String usuario) {
        this.id = 0;
        this.usuario = usuario;
        this.clave = clave;
    }
    public Usuario(Integer id, String usuario, String clave) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
    }
    

    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }
    public String getusuario() {
        return usuario;
    }
    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    public String getclave() {
        return clave;
    }
    public void setclave(String clave) {
        this.clave = clave;
    }


}
