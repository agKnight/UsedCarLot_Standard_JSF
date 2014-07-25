/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jsf.appBean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nukeboy666
 */
@ManagedBean
@SessionScoped
public class validation implements Serializable {

    private static String login;
    private static String password;
    private final static String validLogin = "root";
    private final static String validPassword = "111";
    private static String page1 = "index.xhtml";
    private static String page2 = "welcome.xhtml";
    private static String nextPage;
    private static String response;

    /**
     * @return the response
     */
    public String getResponse() {
        if (login.compareTo(validLogin) == 0) {
            if (password.compareTo(validPassword) == 0) {
                
//                FacesContext context = FacesContext.getCurrentInstance();
//                HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
//                session.invalidate();
                
                return page2;

            } else {

                return page1;
            }
        }
        return response;
    }

    /**
     * Creates a new instance of validation
     */
    public validation() {
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
}
