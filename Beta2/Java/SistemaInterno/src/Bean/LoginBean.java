/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Dell
 */
public class LoginBean {
    private String NomeFunc;
    private String Usuario;
    private String Senha;
    private String CodEscola;
    private String funcao;
    private String escola;
    private String cpf;

    public String getNomeFunc() {
        return NomeFunc;
    }

    public void setNomeFunc(String NomeFunc) {
        this.NomeFunc = NomeFunc;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getCodEscola() {
        return CodEscola;
    }

    public void setCodEscola(String CodEscola) {
        this.CodEscola = CodEscola;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
