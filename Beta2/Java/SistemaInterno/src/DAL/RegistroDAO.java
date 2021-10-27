/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.RegistroLoginBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Dell
 */
public class RegistroDAO {
    private Connection c;
    
    public RegistroDAO(){
        c = new MetodoConexao().conector();
    }
    
    public void RegistrarLogin(RegistroLoginBean RLB){
    
        String sql = "insert into tblHistorico(CodFuncionario,Nome,Cpf,CodEscola)values(?,?,?,?)";
        
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, RLB.getCodEscola());
            pst.setString(2, RLB.getNome());
            pst.setString(3, RLB.getCpf());
            pst.setString(4, RLB.getCodEscola());
            
            pst.execute();
            
            pst.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
