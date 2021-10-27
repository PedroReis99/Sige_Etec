package Bean;

import java.sql.Blob;
import java.sql.Date;

/**
 *
 * @author Dell
 */
public class AlunoBean {
    
    private String Id_aluno, NomeAluno, RG, Genero, Serie, Fk_escola, Data, Caminho, Periodo;
    private Blob Foto;
    private Date DtNasc;
    private String Inner1, Inner2;

    public String getId_aluno() {
        return Id_aluno;
    }

    public void setId_aluno(String Id_aluno) {
        this.Id_aluno = Id_aluno;
    }

    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String NomeAluno) {
        this.NomeAluno = NomeAluno;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getFk_escola() {
        return Fk_escola;
    }

    public void setFk_escola(String Fk_escola) {
        this.Fk_escola = Fk_escola;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getCaminho() {
        return Caminho;
    }

    public void setCaminho(String Caminho) {
        this.Caminho = Caminho;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public Blob getFoto() {
        return Foto;
    }

    public void setFoto(Blob Foto) {
        this.Foto = Foto;
    }

    public Date getDtNasc() {
        return DtNasc;
    }

    public void setDtNasc(Date DtNasc) {
        this.DtNasc = DtNasc;
    }

    public String getInner1() {
        return Inner1;
    }

    public void setInner1(String Inner1) {
        this.Inner1 = Inner1;
    }

    public String getInner2() {
        return Inner2;
    }

    public void setInner2(String Inner2) {
        this.Inner2 = Inner2;
    }

}
