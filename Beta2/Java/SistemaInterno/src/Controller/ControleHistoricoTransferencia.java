/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.HistTransfBean;
import DAL.HistoricoDAO;

/**
 *
 * @author Dell
 */
public class ControleHistoricoTransferencia {
    
    public void Registrar(String Aluno, String Periodo, String Escola){
        
        HistTransfBean htb = new HistTransfBean();
        htb.setCodAluno(Aluno);
        htb.setPeriodo(Periodo);
        htb.setCodEscola(Escola);
        
        HistoricoDAO hd = new HistoricoDAO();
        hd.RegistroTransferencia(htb);
    }
}
