/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.TurmaBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class TurmaDAO {
    private Connection c;
    
    public TurmaDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdiconarTurma(TurmaBean tb){
    
        String sql = "insert into tblTurma(TurmaT,SerieT,PeriodoT,CodAluno,EscolaCod)values(?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getTurma());
            pst.setString(2, tb.getSerie());
            pst.setString(3, tb.getPeriodo());
            pst.setString(4, tb.getCodAluno());
            pst.setString(5, tb.getEscolaCod());
            
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //inner join tblAluno on tblTurma.CodAluno = tblAluno.Id_aluno 
    
    public List<TurmaBean>lista(String query){
        String sql = "Select TurmaT, SerieT, PeriodoT, CodAluno,NomeAluno from tblTurma "
                + "inner join tblAluno on tblTurma.CodAluno = tblAluno.Id_aluno "+query+""
                + " ORDER BY NomeAluno ASC";
        
        try {
            List<TurmaBean>turmas = new ArrayList<TurmaBean>();
            PreparedStatement pst =c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                TurmaBean tb = new  TurmaBean();
                tb.setTurma(rs.getString("TurmaT"));
                tb.setSerie(rs.getString("SerieT"));
                tb.setPeriodo(rs.getString("PeriodoT"));
                tb.setCodAluno(rs.getString("CodAluno"));
                tb.setAluno(rs.getString("NomeAluno"));
                turmas.add(tb);
                }
            rs.close();
            pst.close();
            return turmas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void ExcluirTurma(String Turma,String Serie, String Periodo, String CodEscola){
        String sql = "delete from tblTurma where TurmaT like '%"+Turma+"%' "
                + "and SerieT like '%"+Serie+"%' and PeriodoT like '%"+Periodo+"%' and EscolaCod like '%"+CodEscola+"%'";
        
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void AlterarAluno(TurmaBean tb){
    
        String sql = "Update tblTurma set TurmaT =?, PeriodoT=? where CodAluno =?";
        
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getTurma());
            pst.setString(2, tb.getPeriodo());
            pst.setString(3, tb.getCodAluno());
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisaTransferencia(TurmaBean tb){
    
        try {
            String sql = "select TurmaT from tblTurma where CodAluno = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getCodAluno());
            ResultSet rs = pst.executeQuery();
            rs.next();
            
            tb.setTurma(rs.getString("TurmaT"));
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void AtualizarTransferencia(TurmaBean tb){
    
        String sql = "Update tblTurma set TurmaT =?, PeriodoT=? where CodAluno =?";
        
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getTurma());
            pst.setString(2, tb.getPeriodo());
            pst.setString(3, tb.getCodAluno());
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
