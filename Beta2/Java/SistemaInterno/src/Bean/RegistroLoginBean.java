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
public class RegistroLoginBean {
   private int Id_Registro;
   private String CodFuncionario, Nome, Cpf,  CodEscola;

    public int getId_Registro() {
        return Id_Registro;
    }

    public void setId_Registro(int Id_Registro) {
        this.Id_Registro = Id_Registro;
    }

    public String getCodFuncionario() {
        return CodFuncionario;
    }

    public void setCodFuncionario(String CodFuncionario) {
        this.CodFuncionario = CodFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCodEscola() {
        return CodEscola;
    }

    public void setCodEscola(String CodEscola) {
        this.CodEscola = CodEscola;
    }
}
