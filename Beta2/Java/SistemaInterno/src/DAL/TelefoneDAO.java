/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.TelefoneBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class TelefoneDAO {

    private Connection c;
    
    public TelefoneDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarTelefone(TelefoneBean tb){
    
        String sql = "insert into tblContato(Celular_Res1, Email,Celular_Res2, Telefone, Telefone2, fk_aluno2)"
                + "values (?, ?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getCelular_Res1());
            pst.setString(2, tb.getEmail());
            pst.setString(3, tb.getCelular_Res2());
            pst.setString(4, tb.getTelefone1());
            pst.setString(5, tb.getTelefone2());
            pst.setString(6, tb.getFk_aluno2());
            
            pst.execute();
            pst.close();
            
        }catch(SQLException e){
        
            throw new RuntimeException(e);
        }
    }
    
    public void ConsultaTelefone(TelefoneBean tb){
    
        try {
            String sql = "Select*from tblContato where fk_aluno2 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getFk_aluno2());
            ResultSet rs = pst.executeQuery();
            rs.next();
            tb.setCelular_Res1(rs.getString("Celular_Res1"));
            tb.setEmail(rs.getString("Email"));
            tb.setCelular_Res2(rs.getString("Celular_Res2"));
            tb.setTelefone1(rs.getString("Telefone"));
            tb.setTelefone2(rs.getString("Telefone2"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void UpdateTelefone(TelefoneBean tb){
    
        try {
            String sql = "Update tblContato set Celular_Res1 = ?, Email =?,Celular_Res2 = ?, Telefone = ?, Telefone2 = ?"
                    + "where fk_aluno2 = ?";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getCelular_Res1());
            pst.setString(2, tb.getEmail());
            pst.setString(2, tb.getCelular_Res2());
            pst.setString(3, tb.getTelefone1());
            pst.setString(4, tb.getTelefone2());
            pst.setString(5, tb.getFk_aluno2());
            
            pst.executeUpdate();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
     
    public void PesquisaEmail(TelefoneBean tb){
    
        try {
            String sql ="select Email from tblContatos where fk_aluno2= ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, tb.getFk_aluno2());
            ResultSet rs = pst.executeQuery();
            rs.next();
            tb.setEmail(rs.getString("Email"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
