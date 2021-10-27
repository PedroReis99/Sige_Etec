/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.ResponsavelBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class ResponsavelDAO {
    
    private Connection c;
    
    public ResponsavelDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarResponsaveis(ResponsavelBean rb){
    
        String sql = "insert into tblResponsaveis(NomeResponsavel1, CpfRes1, NomeResponsavel2, CpfRes2, fk_aluno1)"
                + "values (?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, rb.getNomeResponsavel1()); 
            pst.setString(2, rb.getCpfRes1());
            pst.setString(3, rb.getNomeResponsavel2());
            pst.setString(4, rb.getCpfRes2());
            pst.setString(5, rb.getFk_aluno1());
            
            pst.execute();
            pst.close();
            
        }catch(SQLException ex){
        
            throw new RuntimeException(ex);
        }
    }
    
    public void PesquisarResponsavel(ResponsavelBean rb){

        try {        
            
            String sql = "Select*from tblResponsaveis where fk_aluno1 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, rb.getFk_aluno1());
            ResultSet rs = pst.executeQuery();
            rs.next();
            rb.setNomeResponsavel1(rs.getString("NomeResponsavel1"));
            rb.setNomeResponsavel2(rs.getString("NomeResponsavel2"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void UpdateResponsavel(ResponsavelBean rb){
    
        try {
            String sql = "update tblResponsaveis set NomeResponsavel1 = ?, CpfRes1 = ?, NomeResponsavel2 = ?, "
                    + "CpfRes2 = ? where fk_aluno1 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, rb.getNomeResponsavel1());
            pst.setString(2, rb.getCpfRes1());
            pst.setString(3, rb.getNomeResponsavel2());
            pst.setString(4, rb.getCpfRes2());
            pst.setString(5, rb.getFk_aluno1());
            
            pst.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisarRematricula(ResponsavelBean rb){

        try {        
            
            String sql = "Select*from tblResponsaveis where fk_aluno1 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, rb.getFk_aluno1());
            ResultSet rs = pst.executeQuery();
            rs.next();
            rb.setNomeResponsavel1(rs.getString("NomeResponsavel1"));
            rb.setNomeResponsavel2(rs.getString("NomeResponsavel2"));
            rb.setCpfRes1(rs.getString("CpfRes1"));
            rb.setCpfRes2(rs.getString("CpfRes2"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   
}
