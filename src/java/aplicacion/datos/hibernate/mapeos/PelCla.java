package aplicacion.datos.hibernate.mapeos;
// Generated 07/06/2018 16:43:58 by Hibernate Tools 4.3.1



/**
 * PelCla generated by hbm2java
 */
public class PelCla  implements java.io.Serializable {


     private Integer pcCodigo;
     private Clasificaciones clasificaciones;
     private Peliculas peliculas;
     private boolean pcEstado;

    public PelCla() {
    }

    public PelCla(Clasificaciones clasificaciones, Peliculas peliculas, boolean pcEstado) {
       this.clasificaciones = clasificaciones;
       this.peliculas = peliculas;
       this.pcEstado = pcEstado;
    }
   
    public Integer getPcCodigo() {
        return this.pcCodigo;
    }
    
    public void setPcCodigo(Integer pcCodigo) {
        this.pcCodigo = pcCodigo;
    }
    public Clasificaciones getClasificaciones() {
        return this.clasificaciones;
    }
    
    public void setClasificaciones(Clasificaciones clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
    public Peliculas getPeliculas() {
        return this.peliculas;
    }
    
    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }
    public boolean isPcEstado() {
        return this.pcEstado;
    }
    
    public void setPcEstado(boolean pcEstado) {
        this.pcEstado = pcEstado;
    }




}


