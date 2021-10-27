/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.HistTransfBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class HistoricoDAO {
    
    private Connection c;
    
    public HistoricoDAO(){
        c = new MetodoConexao().conector();
    }
    
    public void RegistroTransferencia(HistTransfBean htb){
    
        String sql = "insert into tblHistoricoTransferencia(CodigoAluno, Periodo, CodigoEscola) values(?,?,?)";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, htb.getCodAluno());
            pst.setString(2, htb.getPeriodo());
            pst.setString(3, htb.getCodEscola());
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
