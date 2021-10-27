/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.ResponsavelBean;
import DAL.ResponsavelDAO;

/**
 *
 * @author Dell
 */
public class ControleResponsavel {
    
    public void Adicionar(String pai, String Cpfpai, String mae, String cpfMae, String aluno){
    
        ResponsavelBean rb = new ResponsavelBean();
        rb.setNomeResponsavel1(pai);
        rb.setCpfRes1(Cpfpai);
        rb.setNomeResponsavel2(mae);
        rb.setCpfRes2(cpfMae);
        rb.setFk_aluno1(aluno);
        
        ResponsavelDAO rd = new ResponsavelDAO();
        rd.AdicionarResponsaveis(rb);
    }
    
    public void PesquisaResponsveis(ResponsavelBean rb){
    
        ResponsavelDAO rd = new ResponsavelDAO();
        rd.PesquisarResponsavel(rb);
    }
    
    public void AtualizarResponsavel(ResponsavelBean rb){
    
        ResponsavelDAO rd = new ResponsavelDAO();
        rd.UpdateResponsavel(rb);
    }
    
    public void PesquisaRematricula(ResponsavelBean rb){
    
        ResponsavelDAO rd = new ResponsavelDAO();
        rd.PesquisarRematricula(rb);
    }
}
