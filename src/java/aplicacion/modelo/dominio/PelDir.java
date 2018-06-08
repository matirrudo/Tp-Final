package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class PelDir implements Serializable{

    private Integer pdCodigo;
    private Director director;
    private Pelicula pelicula;
    private boolean pdEstado;

    public PelDir() {
    }

    public PelDir(Director director, Pelicula pelicula, boolean pdEstado) {
        this.director = director;
        this.pelicula = pelicula;
        this.pdEstado = pdEstado;
    }

    public Integer getPdCodigo() {
        return pdCodigo;
    }

    public void setPdCodigo(Integer pdCodigo) {
        this.pdCodigo = pdCodigo;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public boolean isPdEstado() {
        return pdEstado;
    }

    public void setPdEstado(boolean pdEstado) {
        this.pdEstado = pdEstado;
    }
    

}
