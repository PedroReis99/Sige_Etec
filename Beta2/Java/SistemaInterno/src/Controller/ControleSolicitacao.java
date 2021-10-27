/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.SolicitacaoBean;
import DAL.SolicitacaoDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleSolicitacao {
    
    public void RegistrarSolicitacao(String Aluno, String Periodo, String Serie, String Turma, String CodigoEscolar, String Status){
    
        try {
            SolicitacaoBean sb = new SolicitacaoBean();
            sb.setAluno(Aluno);
            sb.setPeriodo(Periodo);
            sb.setSerie(Serie);
            sb.setTurma(Turma);
            sb.setCodigoEscolar(CodigoEscolar);
            sb.setStats(Status);
        
            SolicitacaoDAO sd = new SolicitacaoDAO();
            sd.Solicitar(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel solicitar a transfêrencia!");
        }
    }
    
    public List<SolicitacaoBean> Listar(String variavel){
            SolicitacaoDAO sd = new SolicitacaoDAO();
            List<SolicitacaoBean>lista = sd.lista(variavel);        
            return lista;
    }
    
    public void Pesquisa(SolicitacaoBean sb){
    
        try {
            SolicitacaoDAO sd = new SolicitacaoDAO();
            sd.Pesquisar(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O código utilizado não existe ou expirou!");
        }
    }
    
    public void Alterar(SolicitacaoBean sb){
    
        SolicitacaoDAO sd = new SolicitacaoDAO();
        sd.AtualizarStats(sb);
    }
}
