
package aplicacion.modelo.dominio;

import java.io.Serializable;


public class Butaca implements Serializable{
    private Integer butCodigo;
     private Sala sala;
     private String butIdentificador;
     private boolean butEstado;

    public Butaca() {
    }

    public Butaca(Sala sala, String butIdentificador, boolean butEstado) {
        this.sala = sala;
        this.butIdentificador = butIdentificador;
        this.butEstado = butEstado;
    }

    public Integer getButCodigo() {
        return butCodigo;
    }

    public void setButCodigo(Integer butCodigo) {
        this.butCodigo = butCodigo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getButIdentificador() {
        return butIdentificador;
    }

    public void setButIdentificador(String butIdentificador) {
        this.butIdentificador = butIdentificador;
    }

    public boolean isButEstado() {
        return butEstado;
    }

    public void setButEstado(boolean butEstado) {
        this.butEstado = butEstado;
    }
     
    
}
