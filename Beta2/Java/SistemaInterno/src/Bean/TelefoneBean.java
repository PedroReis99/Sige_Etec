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
public class TelefoneBean {
    
    private int Id_tel;
    private String Celular_Res1, Email,Celular_Res2, Telefone1, Telefone2, fk_aluno2;

    public int getId_tel() {
        return Id_tel;
    }

    public void setId_tel(int Id_tel) {
        this.Id_tel = Id_tel;
    }

    public String getCelular_Res1() {
        return Celular_Res1;
    }

    public void setCelular_Res1(String Celular_Res1) {
        this.Celular_Res1 = Celular_Res1;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCelular_Res2() {
        return Celular_Res2;
    }

    public void setCelular_Res2(String Celular_Res2) {
        this.Celular_Res2 = Celular_Res2;
    }

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1 = Telefone1;
    }

    public String getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String Telefone2) {
        this.Telefone2 = Telefone2;
    }

    public String getFk_aluno2() {
        return fk_aluno2;
    }

    public void setFk_aluno2(String fk_aluno2) {
        this.fk_aluno2 = fk_aluno2;
    }

}
