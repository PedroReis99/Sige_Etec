/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.EscolasBean;
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
public class EscolaDAO {
    private Connection c;
    
    public EscolaDAO(){
        c= new MetodoConexao().conector();
    }
    
    public List<EscolasBean>ListaEscola(){
    
        String sql="select Id_escola, NomeEscola from tblEscola";
        
        try {
            List<EscolasBean>escolas = new ArrayList<EscolasBean>();
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                EscolasBean eb = new EscolasBean();
                eb.setId_escola(rs.getString("Id_escola"));
                eb.setNomeEscola(rs.getString("NomeEscola"));
                
                escolas.add(eb);
            }
            
            rs.close();
            pst.close();
            return escolas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Escola(EscolasBean eb){
    
        try {
            String sql="select NomeEscola from tblEscola where Id_escola=?";
            PreparedStatement pst =c.prepareStatement(sql);
            pst.setString(1, eb.getId_escola());
            ResultSet rs = pst.executeQuery();
            rs.next();
            eb.setNomeEscola(rs.getString("NomeEscola"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
    
    
