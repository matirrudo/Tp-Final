
package aplicacion.modelo.dominio;


import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class VentaEntradas implements Serializable{
    
     private Integer venCodigo;
     private ButacaCartelera butacasCartelera;
     private Perfil perfil;
     private String venPrecio;
     private String venDescripcion;
     private boolean venEstado;

    public VentaEntradas() {
    }

    public VentaEntradas(ButacaCartelera butacasCartelera, Perfil perfil, String venPrecio, String venDescripcion, boolean venEstado) {
        
        this.butacasCartelera = butacasCartelera;
        this.perfil = perfil;
        this.venPrecio = venPrecio;
        this.venDescripcion = venDescripcion;
        this.venEstado = venEstado;
    }

    public Integer getVenCodigo() {
        return venCodigo;
    }

    public void setVenCodigo(Integer venCodigo) {
        this.venCodigo = venCodigo;
    }

    public ButacaCartelera getButacasCartelera() {
        return butacasCartelera;
    }

    public void setButacasCartelera(ButacaCartelera butacasCartelera) {
        this.butacasCartelera = butacasCartelera;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getVenPrecio() {
        return venPrecio;
    }

    public void setVenPrecio(String venPrecio) {
        this.venPrecio = venPrecio;
    }

    public String getVenDescripcion() {
        return venDescripcion;
    }

    public void setVenDescripcion(String venDescripcion) {
        this.venDescripcion = venDescripcion;
    }

    public boolean isVenEstado() {
        return venEstado;
    }

    public void setVenEstado(boolean venEstado) {
        this.venEstado = venEstado;
    }
    
     
}
