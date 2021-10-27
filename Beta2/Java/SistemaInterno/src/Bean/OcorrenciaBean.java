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
public class OcorrenciaBean {
    private String Id_ocorrencia;
    private String TipodeOcorrencia, Descricao, fk_aluno10;
    private Date DataDaOcorrencia;

    public String getId_ocorrencia() {
        return Id_ocorrencia;
    }

    public void setId_ocorrencia(String Id_ocorrencia) {
        this.Id_ocorrencia = Id_ocorrencia;
    }

    public String getTipodeOcorrencia() {
        return TipodeOcorrencia;
    }

    public void setTipodeOcorrencia(String TipodeOcorrencia) {
        this.TipodeOcorrencia = TipodeOcorrencia;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getFk_aluno10() {
        return fk_aluno10;
    }

    public void setFk_aluno10(String fk_aluno10) {
        this.fk_aluno10 = fk_aluno10;
    }

    public Date getDataDaOcorrencia() {
        return DataDaOcorrencia;
    }

    public void setDataDaOcorrencia(Date DataDaOcorrencia) {
        this.DataDaOcorrencia = DataDaOcorrencia;
    }

    
}
