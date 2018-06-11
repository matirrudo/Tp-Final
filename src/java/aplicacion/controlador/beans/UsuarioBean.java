
package aplicacion.controlador.beans;

import aplicacion.datos.hibernate.dao.IUsuarioDao;
import aplicacion.datos.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author GRUPO8
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {
    private Usuario usuario;
    
    public UsuarioBean() {
        Usuario usuarioSession= (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        if(usuarioSession!=null){
            String nombreUsuario=usuarioSession.getUsuNombreUsuario();
            IUsuarioDao usuarioDao=new UsuarioDAOImp();
            usuario=usuarioDao.obtenerUsuario(nombreUsuario);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
