

package BusinessLogic.Entities;

public class Coordenada {
    private Integer id;
    private String Coordenada;
    private String clave;

    public Coordenada(String Coordenada) {
        this.id = 0;
        this.Coordenada = Coordenada;
        this.clave = clave;
    }
    public Coordenada(Integer id, String Coordenada, String clave) {
        this.id = id;
        this.Coordenada = Coordenada;
        this.clave = clave;
    }
    

    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }
    public String getCoordenada() {
        return Coordenada;
    }
    public void setCoordenada(String Coordenada) {
        this.Coordenada = Coordenada;
    }
    public String getclave() {
        return clave;
    }
    public void setclave(String clave) {
        this.clave = clave;
    }


}
