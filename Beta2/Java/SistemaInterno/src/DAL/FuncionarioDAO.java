/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.FuncionarioBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class FuncionarioDAO {
   
    private Connection c;
    
    public FuncionarioDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void Login(FuncionarioBean fb){
    
        try {
            String sql = "select*from tblFuncionario where Usuario = ? and Senha = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, fb.getUsuario());
            pst.setString(2, fb.getSenha());
            ResultSet rs = pst.executeQuery();
            rs.next();
            fb.setFuncao(rs.getString("Funcao"));
            fb.setEscola(rs.getString("Escola"));
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Adicionar(FuncionarioBean fb){
    
        String sql = "insert into tblFuncionario(Matricula,Nome,Cpf,Email,Perfil,Funcao,Usuario,Senha,Escola)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            //pst.setString(1, fb.getMatricula());
            pst.setString(1, fb.getMatricula());
            pst.setString(2, fb.getNome());
            pst.setString(3, fb.getCpf());
            pst.setString(4, fb.getEmail());
            pst.setString(5, fb.getPerfil());
            pst.setString(6, fb.getFuncao());
            pst.setString(7, fb.getUsuario());
            pst.setString(8, fb.getSenha());
            pst.setString(9, fb.getEscola());
            
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Pesquisar(FuncionarioBean fn){
    
        String sql = "Select*from tblFuncionario where Cpf =? and Matricula =?";
        
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, fn.getCpf());
            pst.setString(2, fn.getMatricula());
            ResultSet rs = pst.executeQuery();
            rs.next();
            fn.setMatricula(rs.getString("Matricula"));
            fn.setNome(rs.getString("Nome"));
            fn.setEmail(rs.getString("Email"));
            fn.setPerfil(rs.getString("Perfil"));
            fn.setFuncao(rs.getString("Funcao"));
            fn.setUsuario(rs.getString("Usuario"));
            fn.setSenha(rs.getString("Senha"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Atualizar(FuncionarioBean fb){

        try {
            String sql = "update tblFuncionario set Nome =?, Email =?, Senha=?, Funcao =? where Matricula=?";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, fb.getNome());
            pst.setString(2, fb.getEmail());
            pst.setString(3, fb.getSenha());
            pst.setString(4, fb.getFuncao());
            pst.setString(5, fb.getMatricula());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Informações alteradas com sucesso!","Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar as informações!","Aviso!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
