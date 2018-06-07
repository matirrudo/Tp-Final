
package aplicacion.modelo.dominio;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Perfil {
    private Integer perCodigo;
     private Usuario usuario;
     private String perNombre;
     private String perApellido;
     private String perDni;
     private Date perFechaNac;
     private String perEmail;
     private String perDireccion;
     private boolean perEstado;

    public Perfil() {
    }

    public Perfil(Integer perCodigo, Usuario usuario, String perNombre, String perApellido, String perDni, Date perFechaNac, String perEmail, String perDireccion, boolean perEstado) {
        this.perCodigo = perCodigo;
        this.usuario = usuario;
        this.perNombre = perNombre;
        this.perApellido = perApellido;
        this.perDni = perDni;
        this.perFechaNac = perFechaNac;
        this.perEmail = perEmail;
        this.perDireccion = perDireccion;
        this.perEstado = perEstado;
    }

    public Integer getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(Integer perCodigo) {
        this.perCodigo = perCodigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerApellido() {
        return perApellido;
    }

    public void setPerApellido(String perApellido) {
        this.perApellido = perApellido;
    }

    public String getPerDni() {
        return perDni;
    }

    public void setPerDni(String perDni) {
        this.perDni = perDni;
    }

    public Date getPerFechaNac() {
        return perFechaNac;
    }

    public void setPerFechaNac(Date perFechaNac) {
        this.perFechaNac = perFechaNac;
    }

    public String getPerEmail() {
        return perEmail;
    }

    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }

    public String getPerDireccion() {
        return perDireccion;
    }

    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public boolean isPerEstado() {
        return perEstado;
    }

    public void setPerEstado(boolean perEstado) {
        this.perEstado = perEstado;
    }

    
    
}
