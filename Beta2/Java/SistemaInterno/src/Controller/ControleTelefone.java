/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.TelefoneBean;
import DAL.TelefoneDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleTelefone {
    
    public void Adicionar(String celular1, String Email,String celular2, String telefone1, String telefone2, String aluno){
    
        try {
            TelefoneBean tb = new TelefoneBean();
            tb.setCelular_Res1(celular1);
            tb.setEmail(Email);
            tb.setCelular_Res2(celular2);
            tb.setTelefone1(telefone1);
            tb.setTelefone2(telefone2);
            tb.setFk_aluno2(aluno);
        
            TelefoneDAO td = new TelefoneDAO();
            td.AdicionarTelefone(tb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro do telefone!");
        }
    }
    
    public void Pesquisa(TelefoneBean tb){
    
        try {
            TelefoneDAO td = new TelefoneDAO();
            td.ConsultaTelefone(tb);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Não foi possivel realizar a pesquisa!");
        }
    }
    
    public void PesquisaEmail(TelefoneBean tb){
    
        TelefoneDAO td = new TelefoneDAO();
        td.PesquisaEmail(tb);
    }
    
    public void AlterarTelefone(TelefoneBean tb){
    
        try {
            TelefoneDAO td = new TelefoneDAO();
            td.UpdateTelefone(tb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar os contatos!");
        }
    }
    
}
