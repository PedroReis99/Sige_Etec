/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.SonoBean;
import DAL.SonoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleSono {
    
    public void Adicionar(String Noite, String madrugada, String dia, String quant, String aluno){
    
        try {
            SonoBean sb = new SonoBean();
        
            sb.setDormeBemNoite(Noite);
            sb.setAcordaMadrugada(madrugada);
            sb.setDormeDia(dia);
            sb.setQuntHr(quant);
            sb.setFk_aluno6(aluno);
        
            SonoDAO sd = new SonoDAO();
            sd.InserirSono(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar a ficha de sono!");
        }
    }
    
    public void ConsultaSono(SonoBean sb){
        try {
            SonoDAO sd = new SonoDAO();
            sd.PesquisaSono(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a pesquisa!");
        }
    }
}
