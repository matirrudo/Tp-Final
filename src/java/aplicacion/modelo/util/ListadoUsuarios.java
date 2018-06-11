
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;

/**
 *
 * @author GRUPO8
 */
public class ListadoUsuarios implements Serializable{
    public static Usuario[] listadoUsuarios={new Usuario("admin", "admin", "administrador", true),new Usuario("super", "super", "supervisor", true), new Usuario("comun", "comun", "comun", true)};
    
}
