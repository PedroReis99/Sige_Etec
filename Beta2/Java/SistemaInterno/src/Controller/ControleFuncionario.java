/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.FuncionarioBean;
import DAL.FuncionarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleFuncionario {
    
    public void Adicionar(String Matricula,String nome, String cpf, String email, String Perfil, String funcao, String usuario,
            String senha, String escola){
    
        try {
            FuncionarioBean fb = new FuncionarioBean();
        
            fb.setMatricula(Matricula);
            fb.setNome(nome);
            fb.setCpf(cpf);
            fb.setEmail(email);
            fb.setPerfil(Perfil);
            fb.setFuncao(funcao);
            fb.setUsuario(usuario);
            fb.setSenha(senha);
            fb.setEscola(escola);
        
            FuncionarioDAO fd = new FuncionarioDAO();
            fd.Adicionar(fb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o funcionario!");
        }
    }
    
    public void LoginUser(FuncionarioBean fb){
    
        try {
            FuncionarioDAO fd = new FuncionarioDAO();
            fd.Login(fb);
        } catch (Exception e) {
        }

    }
    
    public void PesquisaFunc(FuncionarioBean fb){
    
        try {
            FuncionarioDAO fd = new FuncionarioDAO();
            fd.Pesquisar(fb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o funcionario");
        }
    }
    
    public void Atualizar(FuncionarioBean fb){
        try {
            FuncionarioDAO fd = new FuncionarioDAO();
            fd.Atualizar(fb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar as informações!");
        }
    }
}
