/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.LoginBean;
import DAL.LoginDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleLogin {
    
    public void Logar(LoginBean lb){
    
        try {
            LoginDAO ld = new LoginDAO();
            ld.Login(lb);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel se conectar aos serviços do Si.G.E! \n"
                 + "Verifique sua conexão com a internet ou entre em contato com o suporte", "Aviso",
                 JOptionPane.ERROR_MESSAGE);
        }
    }
}
