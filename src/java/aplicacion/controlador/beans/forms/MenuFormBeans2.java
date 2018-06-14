/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author mi pc
 */
@ManagedBean
@RequestScoped
public class MenuFormBeans2 {

     public MenuFormBeans2() {
    
    }
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
    
    
}}
