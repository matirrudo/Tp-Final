package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Usuario;
import javax.faces.context.FacesContext;

public class MenuFormBean {

    public boolean verificarUsuarioAdministrador() {
        boolean resultado = false;
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        if (usuario.getUsuTipoUsuario().compareTo("administrador") == 0) {
            resultado = true;
        }
        return resultado;
    }

    public boolean verificarUsuarioSupervisor() {
        boolean resultado = false;
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        if (usuario.getUsuTipoUsuario().compareTo("supervisor") == 0) {
            resultado = true;
        }
        return resultado;
    }

    public boolean verificarUsuarioComun() {
        boolean resultado = false;
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        if (usuario.getUsuTipoUsuario().compareTo("comun") == 0) {
            resultado = true;
        }
        return resultado;
    }
}