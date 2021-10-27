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
public class TurmaBean {
    private int Id_Turma;
    private String Turma;
    private String Serie;
    private String Periodo;
    private String CodAluno;
    private String EscolaCod;
    private String Aluno;
    
    public int getId_Turma() {
        return Id_Turma;
    }

    public void setId_Turma(int Id_Turma) {
        this.Id_Turma = Id_Turma;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getCodAluno() {
        return CodAluno;
    }

    public void setCodAluno(String CodAluno) {
        this.CodAluno = CodAluno;
    }

    public String getEscolaCod() {
        return EscolaCod;
    }

    public void setEscolaCod(String EscolaCod) {
        this.EscolaCod = EscolaCod;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String Aluno) {
        this.Aluno = Aluno;
    }
}
