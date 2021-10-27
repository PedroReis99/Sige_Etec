/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.RegistroLoginBean;
import DAL.RegistroDAO;

/**
 *
 * @author Dell
 */
public class ControleRegistro {
    
    public void Adicionar(String CodFuncionario, String Nome, String Cpf,String CodEscola){
    
        RegistroLoginBean RLB = new RegistroLoginBean();
        
        RLB.setCodFuncionario(CodFuncionario);
        RLB.setNome(Nome);
        RLB.setCpf(Cpf);
        RLB.setCodEscola(CodEscola);
        
        RegistroDAO RD = new RegistroDAO();
        RD.RegistrarLogin(RLB);
    }
    
}
