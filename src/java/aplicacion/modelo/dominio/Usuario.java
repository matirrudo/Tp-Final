
package aplicacion.modelo.dominio;

/**
 *
 * @author LENOVO
 */
public class Usuario {
    private Integer usuCodigo;
    private String usuNombreUsuario;
    private String usuPassword;
    private String usuTipoUsuario;
    private boolean usuEstado;

    public Usuario() {
    }

    public Usuario(int usuCodigo, String usuNombreUsuario, String usuPassword, String usuTipoUsuario, boolean usuEstado) {
        this.usuCodigo = usuCodigo;
        this.usuNombreUsuario = usuNombreUsuario;
        this.usuPassword = usuPassword;
        this.usuTipoUsuario = usuTipoUsuario;
        this.usuEstado = usuEstado;
    }

    public int getUsuCodigo() {
        return usuCodigo;
    }

    public void setUsuCodigo(int usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public String getUsuNombreUsuario() {
        return usuNombreUsuario;
    }

    public void setUsuNombreUsuario(String usuNombreUsuario) {
        this.usuNombreUsuario = usuNombreUsuario;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public String getUsuTipoUsuario() {
        return usuTipoUsuario;
    }

    public void setUsuTipoUsuario(String usuTipoUsuario) {
        this.usuTipoUsuario = usuTipoUsuario;
    }

    public boolean isUsuEstado() {
        return usuEstado;
    }

    public void setUsuEstado(boolean usuEstado) {
        this.usuEstado = usuEstado;
    }
    
}
