
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Cartelera implements Serializable{
    private Integer carCodigo;
    private Pelicula pelicula;
    private Sala sala;
    private Date carFecha;
    private String carHorario;
    private double carPrecio;
    private boolean carEstado;
    private Set preciosCartelerases = new HashSet(0);
    private Set butacasCartelerases = new HashSet(0);

    public Cartelera() {
    }

    public Cartelera(Pelicula pelicula, Sala sala, Date carFecha, String carHorario, double carPrecio, boolean carEstado) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.carFecha = carFecha;
        this.carHorario = carHorario;
        this.carPrecio = carPrecio;
        this.carEstado = carEstado;
    }

    public Cartelera(Pelicula pelicula, Sala sala, Date carFecha, String carHorario, double carPrecio, boolean carEstado, Set preciosCartelerases, Set butacasCartelerases) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.carFecha = carFecha;
        this.carHorario = carHorario;
        this.carPrecio = carPrecio;
        this.carEstado = carEstado;
        this.preciosCartelerases = preciosCartelerases;
        this.butacasCartelerases = butacasCartelerases;
    }

    public Integer getCarCodigo() {
        return carCodigo;
    }

    public void setCarCodigo(Integer carCodigo) {
        this.carCodigo = carCodigo;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getCarFecha() {
        return carFecha;
    }

    public void setCarFecha(Date carFecha) {
        this.carFecha = carFecha;
    }

    public String getCarHorario() {
        return carHorario;
    }

    public void setCarHorario(String carHorario) {
        this.carHorario = carHorario;
    }

    public double getCarPrecio() {
        return carPrecio;
    }

    public void setCarPrecio(double carPrecio) {
        this.carPrecio = carPrecio;
    }

    public boolean isCarEstado() {
        return carEstado;
    }

    public void setCarEstado(boolean carEstado) {
        this.carEstado = carEstado;
    }

    public Set getPreciosCartelerases() {
        return preciosCartelerases;
    }

    public void setPreciosCartelerases(Set preciosCartelerases) {
        this.preciosCartelerases = preciosCartelerases;
    }

    public Set getButacasCartelerases() {
        return butacasCartelerases;
    }

    public void setButacasCartelerases(Set butacasCartelerases) {
        this.butacasCartelerases = butacasCartelerases;
    }
    
    
}
