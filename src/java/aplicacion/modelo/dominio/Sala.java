package aplicacion.modelo.dominio;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Sala {

    private Integer salCodigo;
    private String salNombre;
    private String salDescripcion;
    private boolean salEstado;
    private Set butacases = new HashSet(0);
    private Set cartelerases = new HashSet(0);

    public Sala() {
    }

    public Sala(String salNombre, String salDescripcion, boolean salEstado) {
        this.salNombre = salNombre;
        this.salDescripcion = salDescripcion;
        this.salEstado = salEstado;
    }

    public Sala(String salNombre, String salDescripcion, boolean salEstado, Set butacases, Set cartelerases) {
        this.salNombre = salNombre;
        this.salDescripcion = salDescripcion;
        this.salEstado = salEstado;
        this.butacases = butacases;
        this.cartelerases = cartelerases;
    }

    public Integer getSalCodigo() {
        return salCodigo;
    }

    public void setSalCodigo(Integer salCodigo) {
        this.salCodigo = salCodigo;
    }

    public String getSalNombre() {
        return salNombre;
    }

    public void setSalNombre(String salNombre) {
        this.salNombre = salNombre;
    }

    public String getSalDescripcion() {
        return salDescripcion;
    }

    public void setSalDescripcion(String salDescripcion) {
        this.salDescripcion = salDescripcion;
    }

    public boolean isSalEstado() {
        return salEstado;
    }

    public void setSalEstado(boolean salEstado) {
        this.salEstado = salEstado;
    }

    public Set getButacases() {
        return butacases;
    }

    public void setButacases(Set butacases) {
        this.butacases = butacases;
    }

    public Set getCartelerases() {
        return cartelerases;
    }

    public void setCartelerases(Set cartelerases) {
        this.cartelerases = cartelerases;
    }

}
