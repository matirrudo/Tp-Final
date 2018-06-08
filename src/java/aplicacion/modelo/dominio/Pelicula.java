package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Pelicula implements Serializable{

    private Integer pelCodigo;
    private String pelNombre;
    private String pelDescripcion;
    private boolean pelEstado;
    private Set pelDirs = new HashSet(0);
    private Set cartelerases = new HashSet(0);
    private Set pelClas = new HashSet(0);

    public Pelicula() {
    }

    public Pelicula(String pelNombre, String pelDescripcion, boolean pelEstado) {
        this.pelNombre = pelNombre;
        this.pelDescripcion = pelDescripcion;
        this.pelEstado = pelEstado;
    }

    public Pelicula(String pelNombre, String pelDescripcion, boolean pelEstado, Set pelDirs, Set cartelerases, Set pelClas) {
        this.pelNombre = pelNombre;
        this.pelDescripcion = pelDescripcion;
        this.pelEstado = pelEstado;
        this.pelDirs = pelDirs;
        this.cartelerases = cartelerases;
        this.pelClas = pelClas;
    }

    public Integer getPelCodigo() {
        return pelCodigo;
    }

    public void setPelCodigo(Integer pelCodigo) {
        this.pelCodigo = pelCodigo;
    }

    public String getPelNombre() {
        return pelNombre;
    }

    public void setPelNombre(String pelNombre) {
        this.pelNombre = pelNombre;
    }

    public String getPelDescripcion() {
        return pelDescripcion;
    }

    public void setPelDescripcion(String pelDescripcion) {
        this.pelDescripcion = pelDescripcion;
    }

    public boolean isPelEstado() {
        return pelEstado;
    }

    public void setPelEstado(boolean pelEstado) {
        this.pelEstado = pelEstado;
    }

    public Set getPelDirs() {
        return pelDirs;
    }

    public void setPelDirs(Set pelDirs) {
        this.pelDirs = pelDirs;
    }

    public Set getCartelerases() {
        return cartelerases;
    }

    public void setCartelerases(Set cartelerases) {
        this.cartelerases = cartelerases;
    }

    public Set getPelClas() {
        return pelClas;
    }

    public void setPelClas(Set pelClas) {
        this.pelClas = pelClas;
    }

}
