
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author GRUPO8
 */
public interface IUsuarioDao {
    Usuario validarUsuario(String nombreUsuario, String password);
    void modificarUsuario(Usuario modUsuario);
    Usuario obtenerUsuario(String nombreUsuario);
}
