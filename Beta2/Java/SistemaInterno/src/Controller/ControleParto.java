/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.PartoBean;
import DAL.PartoDAO;

/**
 *
 * @author Dell
 */
public class ControleParto {
    
    public void AdicionarParto(String local, String peso, String altura, String duracao, String desinvolvimento, String anestesia,
            String tipo, String choro, String roxo, String ictericia, String incubadora, String diasincub, String alunofk){
    
        PartoBean pb = new PartoBean();
        pb.setLocalPar(local);
        pb.setPeso(peso);
        pb.setAltura(altura);
        pb.setDuracao(duracao);
        pb.setDesenvPar(diasincub);
        pb.setAnestesia(anestesia);
        pb.setTipoAnes(tipo);
        pb.setChoro(choro);
        pb.setRoxo(roxo);
        pb.setIctericia(ictericia);
        pb.setIncubadora(incubadora);
        pb.setDiasIncub(diasincub);
        pb.setFk_aluno4(alunofk);
        
        PartoDAO pd = new PartoDAO();
        pd.AdicionarParto(pb);
    }
    
    public void PesquisaParto(PartoBean pb){
    
        PartoDAO pd = new PartoDAO();
        pd.PesquisaParto(pb);
    }
}
