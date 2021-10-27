/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.EscolasBean;
import DAL.EscolaDAO;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ControleEscola {
    
    public List<EscolasBean>lista(){
        
        EscolaDAO ed = new EscolaDAO();
        List<EscolasBean>escolas = ed.ListaEscola();
        return escolas;
    }
    
    public void Pesquisa(EscolasBean eb){
        
        EscolaDAO ed = new EscolaDAO();
        ed.Escola(eb);
    }
    
}
