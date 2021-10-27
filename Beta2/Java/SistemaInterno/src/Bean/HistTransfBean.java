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
public class HistTransfBean {
    
    private int id;
    private String CodAluno, CodEscola, Periodo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodAluno() {
        return CodAluno;
    }

    public void setCodAluno(String CodAluno) {
        this.CodAluno = CodAluno;
    }

    public String getCodEscola() {
        return CodEscola;
    }

    public void setCodEscola(String CodEscola) {
        this.CodEscola = CodEscola;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }
}
