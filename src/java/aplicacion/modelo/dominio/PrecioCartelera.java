package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class PrecioCartelera implements Serializable {

    private Integer preCodigo;
    private Cartelera cartelera;
    private String preDescripcion;
    private double prePrecio;

    public PrecioCartelera(Cartelera cartelera, String preDescripcion, double prePrecio) {
        this.cartelera = cartelera;
        this.preDescripcion = preDescripcion;
        this.prePrecio = prePrecio;
    }

    public PrecioCartelera() {
    }

    public Integer getPreCodigo() {
        return preCodigo;
    }

    public void setPreCodigo(Integer preCodigo) {
        this.preCodigo = preCodigo;
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }

    public String getPreDescripcion() {
        return preDescripcion;
    }

    public void setPreDescripcion(String preDescripcion) {
        this.preDescripcion = preDescripcion;
    }

    public double getPrePrecio() {
        return prePrecio;
    }

    public void setPrePrecio(double prePrecio) {
        this.prePrecio = prePrecio;
    }

}
