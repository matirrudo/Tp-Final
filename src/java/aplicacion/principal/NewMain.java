/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.principal;

import aplicacion.datos.hibernate.dao.IPerfilDAO;
import aplicacion.datos.hibernate.dao.imp.PerfilDAOImp;
import aplicacion.modelo.dominio.Perfil;
import aplicacion.modelo.dominio.Usuario;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class NewMain {
    public static void main(String[] args) {
        
        Usuario usuario=new Usuario("admin2","admin2","administrador",true);
        IPerfilDAO perfil=new PerfilDAOImp();
        perfil.agregar(new Perfil(usuario,"jose","condori","2313",new Date(),"ma@fas.com","barrio cente",true));
        System.out.println("TErminado "+ usuario.getUsuNombreUsuario());
        
    }
    
}
