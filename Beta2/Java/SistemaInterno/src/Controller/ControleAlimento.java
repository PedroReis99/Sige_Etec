/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.AlimentoBean;
import DAL.AlimentoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleAlimento {
    
    public void adicionar(String peito, String vezes, String mamadeira, String quantidade, String solido, String alunofk){
    
        try {
            AlimentoBean ab = new AlimentoBean();
            ab.setMamaPeito(peito);
            ab.setVezesDia(vezes);
            ab.setUsoMamadeira(mamadeira);
            ab.setMamadeiraQtdDia(quantidade);
            ab.setAlimentoSolido(solido);
            ab.setFk_aluno5(alunofk);
    
            AlimentoDAO ad = new AlimentoDAO();
            ad.InserirAlimento(ab);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro!");
        }
    }
    
    public void Pesquisar(AlimentoBean ab){
    
        try {
            AlimentoDAO ad = new AlimentoDAO();
            ad.ProcurarAlimento(ab);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foram encontrados resultados \n"
                    + "sobre a ficha de alimentação!");
        }
        
    }
}
