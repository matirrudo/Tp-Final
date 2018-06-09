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
    private String dirApellido;
    private String dirNombre;
    private boolean dirEstado;
    private Set pelDirs = new HashSet(0);

    public Director() {
    }

    public Director(String dirApellido, String dirNombres, boolean dirEstado) {
        this.dirApellido = dirApellido;
        this.dirNombre = dirNombre;
        this.dirEstado = dirEstado;
    }

    public Director(String dirApellido, String dirNombre, boolean dirEstado, Set pelDirs) {
        this.dirApellido = dirApellido;
        this.dirNombre = dirNombre;
        this.dirEstado = dirEstado;
        this.pelDirs = pelDirs;
    }

    public Integer getDirCodigo() {
        return dirCodigo;
    }

    public void setDirCodigo(Integer dirCodigo) {
        this.dirCodigo = dirCodigo;
    }

    public String getDirApellido() {
        return dirApellido;
    }

    public void setDirApellido(String dirApellido) {
        this.dirApellido = dirApellido;
    }

    public String getDirNombre() {
        return dirNombre;
    }

    public void setDirNombre(String dirNombre) {
        this.dirNombre = dirNombre;
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
