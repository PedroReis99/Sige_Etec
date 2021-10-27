/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.SaudeBean;
import DAL.SaudeDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ControleSaude {
    
    public void AdicionarFichaSaude(String Medicamento, String Alergia, String Respiratorio, String Cardiaco,
            String Neurologico, String AcompanhamentoNeuro, String Restricao, String refluxo, String sonda, String pomada, 
            String motora, String motor, String proteses, String Convulcao, String doencas, String outras, String internacao,
            String benzetacil, String febre, String convenio, String aluno){
    
        try {
            SaudeBean sb = new SaudeBean();
            sb.setDecMedic(Medicamento);
            sb.setDescAlergia(Alergia);
            sb.setProbRespiratorio(Respiratorio);
            sb.setDescCardiaco(Cardiaco);
            sb.setDescNeurologico(Neurologico);
            sb.setAcompanhamentoNeuro(AcompanhamentoNeuro);
            sb.setDescRestri(Restricao);
            sb.setRefluxoGastroesofagico(refluxo);
            sb.setUsoSonda(sonda);
            sb.setDescPomada(pomada);
            sb.setDeficienciaMotora(motora);
            sb.setDescMotor(motor);
            sb.setProtesePinosCadeiraRodas(proteses);
            sb.setDescConvulcao(Convulcao);
            sb.setDoencasPassadas(doencas);
            sb.setOutrasDoencas(outras);
            sb.setInternacao(internacao);
            sb.setBenzetacil(benzetacil);
            sb.setMedicamentoFebre(febre);
            sb.setDescConvenio(convenio);
            sb.setFk_aluno7(aluno);
        
            SaudeDAO sd = new SaudeDAO();
            sd.AdicionarFichaSaude(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar a ficha de saúde!");
        }

    }
    
    public void PesquisaSaude(SaudeBean sb){
    
        try {
            SaudeDAO sd = new SaudeDAO();
            sd.PesquisaSaude(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!");
        }
    }
    
    public void AlterarSaude(SaudeBean sb){
    
        try {
            SaudeDAO sd = new SaudeDAO();
            sd.UpdateSaude(sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel atualizar a ficha de saúde!");
        }
    }
}
