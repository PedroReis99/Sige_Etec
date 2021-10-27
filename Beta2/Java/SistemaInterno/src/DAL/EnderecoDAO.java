/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.EnderecoBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class EnderecoDAO {
    
    private Connection c;
    
    public EnderecoDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarEndereco(EnderecoBean eb){
    
        String sql ="insert into tblEndereco(Cidade,  UF, Bairro, Rua, Cep, Numero, Bloco, fk_aluno3)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, eb.getCidade());
            pst.setString(2, eb.getUF());
            pst.setString(3, eb.getBairro());
            pst.setString(4, eb.getRua());
            pst.setString(5, eb.getCep());
            pst.setString(6, eb.getNumero());
            pst.setString(7, eb.getBloco());
            pst.setString(8, eb.getFk_aluno3());
            
            pst.execute();
            pst.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void ConsultaEndereco(EnderecoBean ed){
    
        try {
            String sql = "Select*from tblEndereco where fk_aluno3 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ed.getFk_aluno3());
            ResultSet rs = pst.executeQuery();
            rs.next();
            ed.setCidade(rs.getString("Cidade"));
            ed.setUF(rs.getString("UF"));
            ed.setBairro(rs.getString("Bairro"));
            ed.setRua(rs.getString("Rua"));
            ed.setCep(rs.getString("Cep"));
            ed.setNumero(rs.getString("Numero"));
            ed.setBloco(rs.getString("Bloco"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void UpdateEndereco(EnderecoBean eb){
    
        try {
            
            String sql = "Update tblEndereco set Cidade = ?, UF = ?, Bairro = ?, Rua = ?, Cep = ?,"
                    + "Numero = ?, Bloco = ? where fk_aluno3 = ? ";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, eb.getCidade());
            pst.setString(2, eb.getUF());
            pst.setString(3, eb.getBairro());
            pst.setString(4, eb.getRua());
            pst.setString(5, eb.getCep());
            pst.setString(6, eb.getNumero());
            pst.setString(7, eb.getBloco());
            pst.setString(8, eb.getFk_aluno3());
            
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
