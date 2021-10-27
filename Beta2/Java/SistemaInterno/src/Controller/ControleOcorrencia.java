/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.OcorrenciaBean;
import DAL.OcorrenciaDAO;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ControleOcorrencia {
    
    
    public void AdicionarOcorrencia(String tipo, String descricao, String alunofk){
    
        OcorrenciaBean ob = new OcorrenciaBean();
        ob.setTipodeOcorrencia(tipo);
        ob.setDescricao(descricao);
        ob.setFk_aluno10(alunofk);
        
        OcorrenciaDAO od = new OcorrenciaDAO();
        od.AdicionarOcorrencia(ob);
        
    }
    
    public List<OcorrenciaBean>listar(OcorrenciaBean ob){
    
        OcorrenciaDAO od = new OcorrenciaDAO();
        List<OcorrenciaBean>ocorrencia = od.listar(ob);
        return ocorrencia;
    }
}
