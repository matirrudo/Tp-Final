
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.IUsuarioDao;
import aplicacion.datos.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import javax.faces.context.FacesContext;

/**
 *
 * @author mi pc
 */
@ManagedBean
@RequestScoped
public class LoginBean {
    private String nombreUsuario;
    private String password;

    public LoginBean() {
    }

    public String validarUsuario() {
        String irPagina = null;
        IUsuarioDao usuarioDao = new UsuarioDAOImp();
        Usuario usuario = usuarioDao.validarUsuario(nombreUsuario, password);
        if (usuario != null) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario valido", "Usuario valido");
            FacesContext.getCurrentInstance().addMessage(null, fm);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValido", usuario);
            if(usuario.getUsuTipoUsuario().equals("administrador")) {
                irPagina = "menu.xhtml";
            } else if (usuario.getUsuTipoUsuario().equals("supervisor")) {
                irPagina = "menu.xhtml";
            } else if (usuario.getUsuTipoUsuario().equals("comun")) {
                irPagina = "menu.xhtml";
            }

        } else {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario Invalido", "Usuario Invalido");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        }

        return irPagina;
    }

    public String mostrarUsuarioValidado() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido");
        return usuario.getUsuNombreUsuario();
    }

    public String mostrarTipoUsuario() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido");
        return usuario.getUsuTipoUsuario();
    }

    public String cerrarSesion() {
        String irPagina = null;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesion cerrada", "Sesion Cerrada");
        FacesContext.getCurrentInstance().addMessage(null, fm);
        irPagina = "login.xhtml";
        return irPagina;
    }

    public boolean verificarSesion() {
        boolean sesion = false;
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido") != null) {
            sesion = true;
        }
        return sesion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
    public boolean validarUsuarioBool() {
        boolean irPagina = false;
        IUsuarioDao usuarioDao = new UsuarioDAOImp();
        Usuario usuario = usuarioDao.validarUsuario(nombreUsuario, password);
        if (usuario != null) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario valido", "Usuario valido");
            FacesContext.getCurrentInstance().addMessage(null, fm);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValido", usuario);
            if(usuario.getUsuTipoUsuario().equals("administrador")) {
                irPagina = true;
            } else if (usuario.getUsuTipoUsuario().equals("supervisor")) {
                irPagina = true;
            } else if (usuario.getUsuTipoUsuario().equals("comun")) {
                irPagina = true;
            }

        } else {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario Invalido", "Usuario Invalido");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        }

        return irPagina;
    }

}
