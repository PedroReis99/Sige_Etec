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
public class EnderecoBean {
    
    private int Id_end;
    private String Cidade, UF, Bairro, Rua, Cep, Numero, Bloco, fk_aluno3;

    public int getId_end() {
        return Id_end;
    }

    public void setId_end(int Id_end) {
        this.Id_end = Id_end;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getBloco() {
        return Bloco;
    }

    public void setBloco(String Bloco) {
        this.Bloco = Bloco;
    }

    public String getFk_aluno3() {
        return fk_aluno3;
    }

    public void setFk_aluno3(String fk_aluno3) {
        this.fk_aluno3 = fk_aluno3;
    }

}
