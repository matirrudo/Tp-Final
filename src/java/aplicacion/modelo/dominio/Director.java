/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Director implements Serializable {

    private Integer dirCodigo;
    private String dirApellidos;
    private String dirNombres;
    private boolean dirEstado;
    private Set pelDirs = new HashSet(0);

    public Director() {
    }

    public Director(String dirApellidos, String dirNombres, boolean dirEstado) {
        this.dirApellidos = dirApellidos;
        this.dirNombres = dirNombres;
        this.dirEstado = dirEstado;
    }

    public Director(String dirApellidos, String dirNombres, boolean dirEstado, Set pelDirs) {
        this.dirApellidos = dirApellidos;
        this.dirNombres = dirNombres;
        this.dirEstado = dirEstado;
        this.pelDirs = pelDirs;
    }

    public Integer getDirCodigo() {
        return dirCodigo;
    }

    public void setDirCodigo(Integer dirCodigo) {
        this.dirCodigo = dirCodigo;
    }

    public String getDirApellidos() {
        return dirApellidos;
    }

    public void setDirApellidos(String dirApellidos) {
        this.dirApellidos = dirApellidos;
    }

    public String getDirNombres() {
        return dirNombres;
    }

    public void setDirNombres(String dirNombres) {
        this.dirNombres = dirNombres;
    }

    public boolean isDirEstado() {
        return dirEstado;
    }

    public void setDirEstado(boolean dirEstado) {
        this.dirEstado = dirEstado;
    }

    public Set getPelDirs() {
        return pelDirs;
    }

    public void setPelDirs(Set pelDirs) {
        this.pelDirs = pelDirs;
    }
    
    

}
