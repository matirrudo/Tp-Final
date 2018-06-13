/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Perfil;
import java.io.Serializable;
import org.hibernate.Session;
import aplicacion.datos.hibernate.dao.IPerfilDAO;

/**
 *
 * @author LENOVO
 */
public class 
        PerfilDAOImp implements IPerfilDAO, Serializable {

    @Override
    public void agregar(Perfil perfil) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(perfil);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
