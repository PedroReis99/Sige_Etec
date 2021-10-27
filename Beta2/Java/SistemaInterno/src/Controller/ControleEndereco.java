package Controller;

import Bean.EnderecoBean;
import DAL.EnderecoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleEndereco {
    
    public void Adicionar(String cidade, String estado, String bairro, String rua, String cep, String numero, String bloco,
            String aluno){
    
        try {
            EnderecoBean eb = new EnderecoBean();
            eb.setCidade(cidade);
            eb.setUF(estado);
            eb.setBairro(bairro);
            eb.setRua(rua);
            eb.setCep(cep);
            eb.setNumero(numero);
            eb.setBloco(bloco);
            eb.setFk_aluno3(aluno);
        
            EnderecoDAO ed = new EnderecoDAO();
            ed.AdicionarEndereco(eb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel registrar as informações!");
        }

    }
    
    public void PesquisaEndereco(EnderecoBean eb){
    
        try {
            EnderecoDAO ed = new EnderecoDAO();
            ed.ConsultaEndereco(eb);
        } catch (Exception e) {            
        }
        
    }
    
    public void AtualizarEndereco(EnderecoBean eb){
    
        try {
            EnderecoDAO ed = new EnderecoDAO();
            ed.UpdateEndereco(eb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar o endereço!");
        }
    }
}
