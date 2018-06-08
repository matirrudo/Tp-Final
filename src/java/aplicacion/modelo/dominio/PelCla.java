
package aplicacion.modelo.dominio;

import java.io.Serializable;


public class PelCla implements Serializable{
    private Integer pcCodigo;
     private Clasificacion clasificacion;
     private Pelicula pelicula;
     private boolean pcEstado;

    public PelCla() {
    }

    public PelCla(Clasificacion clasificacion, Pelicula pelicula) {
        this.clasificacion = clasificacion;
        this.pelicula = pelicula;
    }

    public Integer getPcCodigo() {
        return pcCodigo;
    }

    public void setPcCodigo(Integer pcCodigo) {
        this.pcCodigo = pcCodigo;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public boolean isPcEstado() {
        return pcEstado;
    }

    public void setPcEstado(boolean pcEstado) {
        this.pcEstado = pcEstado;
    }
     
    
}
