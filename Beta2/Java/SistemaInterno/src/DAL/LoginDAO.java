/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.LoginBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class LoginDAO {
    
    public Connection c;
    
    public LoginDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void Login(LoginBean lb){        
        try {
        String sql = "Select tblFuncionario.Nome, tblFuncionario.Cpf,tblFuncionario.Usuario, " +
                    "tblFuncionario.Senha, tblFuncionario.Funcao, tblFuncionario.Escola,"
                  + " tblEscola.NomeEscola from tblFuncionario " +
                    " inner join tblEscola on tblFuncionario.Escola = tblEscola.Id_escola"
                  + " where Usuario = ? and Senha = ?";
        
            PreparedStatement pst = c.prepareStatement(sql);
            // Recebe as informações para realizar a pesquisa
            pst.setString(1, lb.getUsuario());
            pst.setString(2, lb.getSenha());
            // Método executa a pesquisa
            ResultSet rs = pst.executeQuery();
            rs.next();
            
            lb.setNomeFunc(rs.getString("tblFuncionario.Nome"));
            lb.setFuncao(rs.getString("tblFuncionario.Funcao"));
            lb.setCodEscola(rs.getString("tblFuncionario.Escola"));
            lb.setEscola(rs.getString("tblEscola.NomeEscola"));
            lb.setCpf(rs.getString("tblFuncionario.Cpf"));
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
