package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.dao.IUsuarioDao;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.util.ListadoUsuarios;

/**
 *
 * @author GRUPO8
 */
public class UsuarioDAOImp implements IUsuarioDao {

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario u = null;
        boolean encontrado = false;
        for (int i = 0; i < ListadoUsuarios.listadoUsuarios.length && encontrado != true; i++) {
            Usuario usuarioListado = ListadoUsuarios.listadoUsuarios[i];
            if (usuarioListado != null && usuarioListado.getUsuNombreUsuario().equals(nombreUsuario)
                    && usuarioListado.getUsuPassword().equals(password)) {
                u = usuarioListado;
                encontrado = true;
            }
        }
        return u;
    }

    @Override
    public void modificarUsuario(Usuario modUsuario) {
        boolean encontrado = false;
        for (int i = 0; i < ListadoUsuarios.listadoUsuarios.length && encontrado != true; i++) {
            Usuario usuarioListado = ListadoUsuarios.listadoUsuarios[i];
            if (usuarioListado.getUsuNombreUsuario().equals(modUsuario.getUsuNombreUsuario())) {
                ListadoUsuarios.listadoUsuarios[i] = modUsuario;
                encontrado = true;
            }
        }
    }

    @Override
    public Usuario obtenerUsuario(String nombreUsuario) {
        Usuario u = null;
        boolean encontrado = false;
        for (int i = 0; i < ListadoUsuarios.listadoUsuarios.length && encontrado != true; i++) {
            Usuario usuarioListado = ListadoUsuarios.listadoUsuarios[i];
            if (usuarioListado != null && usuarioListado.getUsuNombreUsuario().equals(nombreUsuario)) {
                u = usuarioListado;
                encontrado = true;
            }
        }
        return u;
    }

}
