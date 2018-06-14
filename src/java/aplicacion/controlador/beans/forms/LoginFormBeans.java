package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.LoginBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;




/**
 *
 * @author GRUPO8
 */
@ManagedBean
@RequestScoped
public class LoginFormBeans {
   @ManagedProperty(value = "#{loginBean}")
   private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    }
