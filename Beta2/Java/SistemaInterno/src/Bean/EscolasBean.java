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
public class EscolasBean {
    
    private String Id_escola;
    private String NomeEscola;
    private int vagas;
    private int CodSecretaria;

    public String getId_escola() {
        return Id_escola;
    }

    public void setId_escola(String Id_escola) {
        this.Id_escola = Id_escola;
    }

    public String getNomeEscola() {
        return NomeEscola;
    }

    public void setNomeEscola(String NomeEscola) {
        this.NomeEscola = NomeEscola;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public int getCodSecretaria() {
        return CodSecretaria;
    }

    public void setCodSecretaria(int CodSecretaria) {
        this.CodSecretaria = CodSecretaria;
    }

}
