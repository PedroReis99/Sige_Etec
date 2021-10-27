/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.ComportamentoBean;
import DAL.ComportamentoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleComportamento {
    
    public void Adicionar(String descricao, String amigavel, String trabalho, String frustracao, String ajuda, String adapta,
            String contato, String aluno){
    
        try {
            ComportamentoBean cb = new ComportamentoBean();
            cb.setDescComportamento(descricao);
            cb.setAmigavel(amigavel);
            cb.setTrabSoloGrupo(trabalho);
            cb.setFrustracao(frustracao);
            cb.setAjudaColega(ajuda);
            cb.setAdaptaNovoGptrab(adapta);
            cb.setContatoAmigos(contato);
            cb.setFk_aluno8(aluno);
        
            ComportamentoDAO cd = new ComportamentoDAO();
            cd.AdicionarComportamento(cb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar as informações de comportamento!");
        }
    }
    
    public void PesquisaComportamento(ComportamentoBean cb){
    
        try {
            ComportamentoDAO cd = new ComportamentoDAO();
            cd.PesquisaComportamento(cb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar as informações solicitadas!");
        }
    }
}
