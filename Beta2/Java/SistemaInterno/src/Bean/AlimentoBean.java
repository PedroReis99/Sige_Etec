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
public class AlimentoBean {
    
    private int Id_alimetacao;
    private String MamaPeito, VezesDia, UsoMamadeira, MamadeiraQtdDia, AlimentoSolido, fk_aluno5;

    public int getId_alimetacao() {
        return Id_alimetacao;
    }

    public void setId_alimetacao(int Id_alimetacao) {
        this.Id_alimetacao = Id_alimetacao;
    }

    public String getMamaPeito() {
        return MamaPeito;
    }

    public void setMamaPeito(String MamaPeito) {
        this.MamaPeito = MamaPeito;
    }

    public String getVezesDia() {
        return VezesDia;
    }

    public void setVezesDia(String VezesDia) {
        this.VezesDia = VezesDia;
    }

    public String getUsoMamadeira() {
        return UsoMamadeira;
    }

    public void setUsoMamadeira(String UsoMamadeira) {
        this.UsoMamadeira = UsoMamadeira;
    }

    public String getMamadeiraQtdDia() {
        return MamadeiraQtdDia;
    }

    public void setMamadeiraQtdDia(String MamadeiraQtdDia) {
        this.MamadeiraQtdDia = MamadeiraQtdDia;
    }

    public String getAlimentoSolido() {
        return AlimentoSolido;
    }

    public void setAlimentoSolido(String AlimentoSolido) {
        this.AlimentoSolido = AlimentoSolido;
    }

    public String getFk_aluno5() {
        return fk_aluno5;
    }

    public void setFk_aluno5(String fk_aluno5) {
        this.fk_aluno5 = fk_aluno5;
    }

}
