
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class ButacaCartelera implements Serializable{
    
    private Integer bcCodigo;
    private Cartelera cartelera;
    private String bcIdentificadorButaca;
    private boolean bcDisponible;
    private boolean bcEstado;
    private Set ventasEntradases = new HashSet(0);

    public ButacaCartelera() {
    }

    public ButacaCartelera(Cartelera cartelera, String bcIdentificadorButaca, boolean bcDisponible, boolean bcEstado) {
        this.cartelera = cartelera;
        this.bcIdentificadorButaca = bcIdentificadorButaca;
        this.bcDisponible = bcDisponible;
        this.bcEstado = bcEstado;
    }

    public Integer getBcCodigo() {
        return bcCodigo;
    }

    public void setBcCodigo(Integer bcCodigo) {
        this.bcCodigo = bcCodigo;
    }

    public Cartelera getCarteler() {
        return cartelera;
    }

    public void setCarteler(Cartelera cartelera) {
        this.cartelera = cartelera;
    }

    public String getBcIdentificadorButaca() {
        return bcIdentificadorButaca;
    }

    public void setBcIdentificadorButaca(String bcIdentificadorButaca) {
        this.bcIdentificadorButaca = bcIdentificadorButaca;
    }

    public boolean isBcDisponible() {
        return bcDisponible;
    }

    public void setBcDisponible(boolean bcDisponible) {
        this.bcDisponible = bcDisponible;
    }

    public boolean isBcEstado() {
        return bcEstado;
    }

    public void setBcEstado(boolean bcEstado) {
        this.bcEstado = bcEstado;
    }

    public Set getVentasEntradases() {
        return ventasEntradases;
    }

    public void setVentasEntradases(Set ventasEntradases) {
        this.ventasEntradases = ventasEntradases;
    }
    
    
}
