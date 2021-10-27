/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.AlunoBean;
import DAL.AlunoDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ControleAluno {

    public void Adicionar(String ra, String nome, String rg, String genero, Date DtNasc, String serie,
            String Caminho, String Periodo, String escola){
    
        try {
            AlunoBean ab = new AlunoBean();
            ab.setId_aluno(ra);
            ab.setNomeAluno(nome);
            ab.setRG(rg);
            ab.setGenero(genero);
            ab.setDtNasc(DtNasc);
            ab.setSerie(serie);
            ab.setCaminho(Caminho);
            ab.setPeriodo(Periodo);
            ab.setFk_escola(escola);
        
            AlunoDAO ad = new AlunoDAO();
            ad.AdicionarAluno(ab);     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o aluno!");
        }
        
    }
    
    public List<AlunoBean>listar(String query){
    
        AlunoDAO ad = new AlunoDAO();
        List<AlunoBean> alunos = ad.listar(query);
        return alunos;
    }
    
    public List<AlunoBean>ListaTurma(String query){
        AlunoDAO ad = new AlunoDAO();
        List<AlunoBean> turmas = ad.turma(query);
        return turmas;
    }
    
    public void Update(AlunoBean ab){
    
        try {
            AlunoDAO ad = new AlunoDAO();
            ad.UpdateAluno(ab);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar as informações!");
        }
    }
    
    public void transferencia(AlunoBean ab){
        try {
            AlunoDAO ad = new AlunoDAO();
            ad.transferencia(ab);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a transfêrencia do aluno!");
        }
    }
    
    public void PesquisaTransferencia(AlunoBean ab){
        try {
            AlunoDAO ad = new AlunoDAO();
            ad.PesquisaTransferencia(ab);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhuma informação encontrada! \n"
                    + "Tente novamente! \n"
                    + "Ou verifique a conexão com a internet.");
        }
    }
    
    public void PesquisaSolicitacao(AlunoBean ab){
        try {
            AlunoDAO ad = new AlunoDAO();
            ad.PesquisaSolicitacao(ab);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhuma informação foi encontrada");
        }
    }

    public void ListarAluno(String query, JTable tbl){
    
        AlunoDAO ad = new AlunoDAO();
        List<AlunoBean> alunos = ad.listar(query);
        DefaultTableModel model = (DefaultTableModel)tbl.getModel();
        model.setNumRows(0);
        
        for(AlunoBean ab : alunos){
        
            model.addRow(new Object[]{
            
                ab.getId_aluno(),
                ab.getNomeAluno(),
                ab.getGenero(),
                ab.getData(),
                ab.getSerie(),
                ab.getFoto()
            });
        }
    }
    
    public void AparecerImagem(JLabel lblFoto, String Id_aluno){
    
        AlunoBean ab = new AlunoBean();
        ab.setId_aluno(Id_aluno);
        AlunoDAO ad = new AlunoDAO();
        ad.PesquisaTudo(ab);
        
        try {
            ImageIcon icon = new ImageIcon(ab.getFoto().getBytes(1, 
                    (int) ab.getFoto().length()));
            icon.setImage(icon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(),
                    1));
            lblFoto.setIcon(icon);
        } catch (Exception e) {
        }
    }
    

}
