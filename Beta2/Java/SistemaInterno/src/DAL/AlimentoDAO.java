/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.AlimentoBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class AlimentoDAO {
    
    private Connection c;
    
    public AlimentoDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void InserirAlimento(AlimentoBean ab){
    
        String sql = "insert into tblAlimentacao(MamaPeito, VezesDia, UsoMamadeira, MamadeiraQntDia, AlimentoSolido, fk_aluno5)"
                + "values(?, ?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ab.getMamaPeito());
            pst.setString(2, ab.getVezesDia());
            pst.setString(3, ab.getUsoMamadeira());
            pst.setString(4, ab.getMamadeiraQtdDia());
            pst.setString(5, ab.getAlimentoSolido());
            pst.setString(6, ab.getFk_aluno5());
            // executa o insert
            pst.execute();
            //fecha a conexao
            pst.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void ProcurarAlimento(AlimentoBean ab){
    
        try {
            String sql = "select*from tblAlimentacao where fk_aluno5 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ab.getFk_aluno5());
            ResultSet rs = pst.executeQuery();
            rs.next();
            ab.setMamaPeito(rs.getString("MamaPeito"));
            ab.setVezesDia(rs.getString("VezesDia"));
            ab.setUsoMamadeira(rs.getString("UsoMamadeira"));
            ab.setMamadeiraQtdDia(rs.getString("MamadeiraQntDia"));
            ab.setAlimentoSolido(rs.getString("AlimentoSolido"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
