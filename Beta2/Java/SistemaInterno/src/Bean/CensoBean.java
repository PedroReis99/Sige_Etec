/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class CensoBean {
    private int Id_Censo;
    private String Pai, Mae,NumCertidao, Livro, Folha, Etnia, fk_aluno9;
    private Date DtExpedicao;

    public int getId_Censo() {
        return Id_Censo;
    }

    public void setId_Censo(int Id_Censo) {
        this.Id_Censo = Id_Censo;
    }

    public String getPai() {
        return Pai;
    }

    public void setPai(String Pai) {
        this.Pai = Pai;
    }

    public String getMae() {
        return Mae;
    }

    public void setMae(String Mae) {
        this.Mae = Mae;
    }

    public String getNumCertidao() {
        return NumCertidao;
    }

    public void setNumCertidao(String NumCertidao) {
        this.NumCertidao = NumCertidao;
    }

    public String getLivro() {
        return Livro;
    }

    public void setLivro(String Livro) {
        this.Livro = Livro;
    }

    public String getFolha() {
        return Folha;
    }

    public void setFolha(String Folha) {
        this.Folha = Folha;
    }

    public String getEtnia() {
        return Etnia;
    }

    public void setEtnia(String Etnia) {
        this.Etnia = Etnia;
    }

    public String getFk_aluno9() {
        return fk_aluno9;
    }

    public void setFk_aluno9(String fk_aluno9) {
        this.fk_aluno9 = fk_aluno9;
    }

    public Date getDtExpedicao() {
        return DtExpedicao;
    }

    public void setDtExpedicao(Date DtExpedicao) {
        this.DtExpedicao = DtExpedicao;
    }

}
