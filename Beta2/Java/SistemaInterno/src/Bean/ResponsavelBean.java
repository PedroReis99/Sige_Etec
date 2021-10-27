/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


public class ResponsavelBean {

    private int Id_res;
    private String NomeResponsavel1, CpfRes1, NomeResponsavel2, CpfRes2, fk_aluno1;

    public int getId_res() {
        return Id_res;
    }

    public void setId_res(int Id_res) {
        this.Id_res = Id_res;
    }

    public String getNomeResponsavel1() {
        return NomeResponsavel1;
    }

    public void setNomeResponsavel1(String NomeResponsavel1) {
        this.NomeResponsavel1 = NomeResponsavel1;
    }

    public String getCpfRes1() {
        return CpfRes1;
    }

    public void setCpfRes1(String CpfRes1) {
        this.CpfRes1 = CpfRes1;
    }

    public String getNomeResponsavel2() {
        return NomeResponsavel2;
    }

    public void setNomeResponsavel2(String NomeResponsavel2) {
        this.NomeResponsavel2 = NomeResponsavel2;
    }

    public String getCpfRes2() {
        return CpfRes2;
    }

    public void setCpfRes2(String CpfRes2) {
        this.CpfRes2 = CpfRes2;
    }

    public String getFk_aluno1() {
        return fk_aluno1;
    }

    public void setFk_aluno1(String fk_aluno1) {
        this.fk_aluno1 = fk_aluno1;
    }

}
