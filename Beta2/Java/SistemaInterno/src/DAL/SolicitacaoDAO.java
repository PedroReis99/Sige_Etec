/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.SolicitacaoBean;
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
public class SolicitacaoDAO {
    
    Connection c;
    
    public SolicitacaoDAO(){
        c = new MetodoConexao().conector();                
    }
    
    // Método para Criar solicitação de transferencia
    public void Solicitar(SolicitacaoBean sb){
    
        String sql = "insert into tblSolicitacaoTrf(Aluno,PeriodoTrf,SerieTrf,TurmaTrf,CodigoEscolar,Stats)values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getAluno());
            pst.setString(2, sb.getPeriodo());
            pst.setString(3, sb.getSerie());
            pst.setString(4, sb.getTurma());
            pst.setString(5, sb.getCodigoEscolar());
            pst.setString(6, sb.getStats());
            
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<SolicitacaoBean>lista(String variavel){
    
        String sql = "select Id_Solicitacao, Aluno, NomeAluno, NomeEscola from tblSolicitacaoTrf"
                + " inner join tblAluno on tblSolicitacaoTrf.Aluno = tblAluno.Id_aluno"
                + " inner join tblEscola on tblSolicitacaoTrf.CodigoEscolar = tblEscola.Id_escola"
                + variavel;
        
        try {
            List<SolicitacaoBean>solicitacoes = new ArrayList<SolicitacaoBean>();
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                SolicitacaoBean sb = new SolicitacaoBean();
                sb.setId(rs.getString("Id_Solicitacao"));
                sb.setAluno(rs.getString("Aluno"));
                sb.setInner1(rs.getString("NomeAluno"));
                sb.setInner2(rs.getString("NomeEscola"));
                
                solicitacoes.add(sb);
            }
            rs.close();
            pst.close();
            return solicitacoes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Pesquisar(SolicitacaoBean sb){

        try {
            String sql = "Select Aluno, NomeAluno, PeriodoTrf, TurmaTrf, NomeEscola, CodigoEscolar, "
                    + " day(DataSolicitacao), month(DataSolicitacao), day(now()), month(now()), "
                    + " year(DataSolicitacao), year(now()) "
                    + " from tblSolicitacaoTrf"
                    + " inner join tblAluno on tblSolicitacaoTrf.Aluno = tblAluno.Id_aluno"
                    + " inner join tblEscola on tblSolicitacaoTrf.CodigoEscolar = tblEscola.Id_escola"
                    + " where Id_Solicitacao = ? and Stats = 'Ativo'";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getId());
            ResultSet rs = pst.executeQuery();
            rs.next();
            sb.setAluno(rs.getString("Aluno"));
            sb.setInner1(rs.getString("NomeAluno"));
            sb.setPeriodo(rs.getString("PeriodoTrf"));
            sb.setTurma(rs.getString("TurmaTrf"));
            sb.setInner2(rs.getString("NomeEscola"));
            sb.setCodigoEscolar(rs.getString("CodigoEscolar"));
            sb.setDia(rs.getInt("day(DataSolicitacao)"));
            sb.setMes(rs.getInt("month(DataSolicitacao)"));
            sb.setDia2(rs.getInt("day(now())"));
            sb.setMes2(rs.getInt("month(now())"));
            sb.setAnoS(rs.getInt("year(DataSolicitacao)"));
            sb.setAnoA(rs.getInt("year(now())"));
        
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void AtualizarStats(SolicitacaoBean sb){
    
        try {
            String sql = "Update tblSolicitacaoTrf set Stats = ? where Id_Solicitacao = ?";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getStats());
            pst.setString(2, sb.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
