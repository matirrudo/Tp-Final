package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Clasificacion implements Serializable{

    private Integer claCodigo;
    private String claDescripcion;
    private boolean claEstado;
    private Set pelClas = new HashSet(0);

    public Clasificacion() {
    }

    public Clasificacion(String claDescripcion, boolean claEstado) {
        this.claDescripcion = claDescripcion;
        this.claEstado = claEstado;
    }

    public Clasificacion(String claDescripcion, boolean claEstado, Set pelClas) {
        this.claDescripcion = claDescripcion;
        this.claEstado = claEstado;
        this.pelClas = pelClas;
    }

    public Integer getClaCodigo() {
        return claCodigo;
    }

    public void setClaCodigo(Integer claCodigo) {
        this.claCodigo = claCodigo;
    }

    public String getClaDescripcion() {
        return claDescripcion;
    }

    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public boolean isClaEstado() {
        return claEstado;
    }

    public void setClaEstado(boolean claEstado) {
        this.claEstado = claEstado;
    }

    public Set getPelClas() {
        return pelClas;
    }

    public void setPelClas(Set pelClas) {
        this.pelClas = pelClas;
    }
    

}
