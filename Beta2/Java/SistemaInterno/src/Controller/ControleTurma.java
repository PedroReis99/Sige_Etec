/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.TurmaBean;
import DAL.TurmaDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleTurma {
    
    public void Adicionar(String turma, String serie,String Periodo, String aluno, String escola){
    
        try {
            TurmaBean tb = new TurmaBean();
            tb.setTurma(turma);
            tb.setSerie(serie);
            tb.setPeriodo(Periodo);
            tb.setCodAluno(aluno);
            tb.setEscolaCod(escola);
        
            TurmaDAO td = new TurmaDAO();
            td.AdiconarTurma(tb);
            JOptionPane.showMessageDialog(null, "Aluno inserido na turma com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar a turma!","Aviso!",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    public List<TurmaBean>turmas(String query){
    
        TurmaDAO td = new TurmaDAO();
        List<TurmaBean>turmas = td.lista(query);
        return turmas;
    }
    
    public void DeletarTurma(String Turma, String Serie, String Periodo, String Escola){

        try {
            TurmaDAO td = new TurmaDAO();
            td.ExcluirTurma(Turma, Serie, Periodo, Escola);
            
            JOptionPane.showMessageDialog(null, "A turma foi excluída com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir a turma!");
        }
        
    }
    
    public void AlterarAluno(String Turma, String Periodo, String Cod){
    
        try {
            TurmaBean tb = new TurmaBean();
            tb.setTurma(Turma);
            tb.setPeriodo(Periodo);
            tb.setCodAluno(Cod);
            TurmaDAO td = new TurmaDAO();
            td.AlterarAluno(tb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trocar o aluno de turma!");
        }
    }
    
    public void AlterarTransferencia(String Turma, String Periodo, String Cod){
        
        TurmaBean tb = new TurmaBean();
        tb.setTurma(Turma);
        tb.setPeriodo(Periodo);
        tb.setCodAluno(Cod);
        TurmaDAO td = new TurmaDAO();
        td.AtualizarTransferencia(tb);
    }
    
    public void PesquisaTransferencia(TurmaBean tb){
    
        TurmaDAO td = new TurmaDAO();
        td.PesquisaTransferencia(tb);
    }
}
