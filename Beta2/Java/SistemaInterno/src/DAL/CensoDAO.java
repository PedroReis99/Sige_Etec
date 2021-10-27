/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.CensoBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class CensoDAO {
    private Connection c;
    
    public CensoDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void InserirCenso(CensoBean cb){
    
        String sql = "insert into tblCensoIBGE(Pai, Mae, NumCertidao, Livro, DtExpedicao, Folha, Etnia, fk_aluno9)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, cb.getPai());
            pst.setString(2, cb.getMae());
            pst.setString(3, cb.getNumCertidao());
            pst.setString(4, cb.getLivro());
            pst.setDate(5, cb.getDtExpedicao());
            pst.setString(6, cb.getFolha());
            pst.setString(7, cb.getEtnia());
            pst.setString(8, cb.getFk_aluno9());
            //Executa o insert
            pst.execute();
            //fecha a conexão
            pst.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
