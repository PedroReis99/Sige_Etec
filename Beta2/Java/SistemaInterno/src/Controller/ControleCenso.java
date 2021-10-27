/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.CensoBean;
import DAL.CensoDAO;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleCenso {
    
    public void Adicionar(String Pai, String Mae,String certidao,
            String livro, Date expedicao, String folha, String etnia, String alunofk){
        
        try {
            CensoBean cb = new CensoBean();
            cb.setPai(Pai);
            cb.setMae(Mae);
            cb.setNumCertidao(certidao);
            cb.setLivro(livro);
            cb.setDtExpedicao(expedicao);
            cb.setFolha(folha);
            cb.setEtnia(etnia);
            cb.setFk_aluno9(alunofk);
        
            CensoDAO cd = new CensoDAO();
            cd.InserirCenso(cb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar as informações");
        }
    }
}
