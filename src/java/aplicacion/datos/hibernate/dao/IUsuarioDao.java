
package aplicacion.datos.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author LENOVO
 */
public interface IUsuarioDao {
    Usuario validarUsuario(String nombreUsuario, String password);
}
