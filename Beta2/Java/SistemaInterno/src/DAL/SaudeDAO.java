/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.SaudeBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dell
 */
public class SaudeDAO {
 
    private Connection c;
    
    public SaudeDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarFichaSaude(SaudeBean sb){
    
        String sql = "insert into tblSaude(DecMedic,DescAlergia,ProbRespiratorio,DescCardiaco,DescNeurologico,AcompanhamentoNeuro,DescRestri,"
                + "RefluxoGastroesofagico,UsoSonda,DescPomada,DeficienciaMotora,DescMotor,ProtesePinosCadeiraRodas,DescConvulsao,DoencasPassadas,"
                + "OutrasDoencas,Internacao,Benzetacil,MedicamentoFebre,DescConvenio,fk_aluno7) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getDecMedic());
            pst.setString(2, sb.getDescAlergia());
            pst.setString(3, sb.getProbRespiratorio());
            pst.setString(4, sb.getDescCardiaco());
            pst.setString(5, sb.getDescNeurologico());
            pst.setString(6, sb.getAcompanhamentoNeuro());
            pst.setString(7, sb.getDescRestri());
            pst.setString(8, sb.getRefluxoGastroesofagico());
            pst.setString(9, sb.getUsoSonda());
            pst.setString(10, sb.getDescPomada());
            pst.setString(11, sb.getDeficienciaMotora());
            pst.setString(12, sb.getDescMotor());
            pst.setString(13, sb.getProtesePinosCadeiraRodas());
            pst.setString(14, sb.getDescConvulcao());
            pst.setString(15, sb.getDoencasPassadas());
            pst.setString(16, sb.getOutrasDoencas());
            pst.setString(17, sb.getInternacao());
            pst.setString(18, sb.getBenzetacil());
            pst.setString(19, sb.getMedicamentoFebre());
            pst.setString(20, sb.getDescConvenio());
            pst.setString(21, sb.getFk_aluno7());
            // Executa a ação de inserir as informações no banco de dados
            pst.execute();
            // Fecha a conexão com o banco de dados.
            pst.close();
            
            
        }catch(SQLException ex){
            throw new RuntimeException (ex);
        }
    }
    
    public void PesquisaSaude(SaudeBean sb){
    
        try {
            String sql = "Select*from tblSaude where fk_aluno7 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getFk_aluno7());
            ResultSet rs = pst.executeQuery();
            rs.next();
            sb.setDecMedic(rs.getString("DecMedic"));
            sb.setDescAlergia(rs.getString("DescAlergia"));
            sb.setProbRespiratorio(rs.getString("ProbRespiratorio"));
            sb.setDescCardiaco(rs.getString("DescCardiaco"));
            sb.setDescNeurologico(rs.getString("DescNeurologico"));
            sb.setAcompanhamentoNeuro(rs.getString("AcompanhamentoNeuro"));
            sb.setDescRestri(rs.getString("DescRestri"));
            sb.setRefluxoGastroesofagico(rs.getString("RefluxoGastroesofagico"));
            sb.setUsoSonda(rs.getString("UsoSonda"));
            sb.setDescPomada(rs.getString("DescPomada"));
            sb.setDeficienciaMotora(rs.getString("DeficienciaMotora"));
            sb.setDescMotor(rs.getString("DescMotor"));
            sb.setProtesePinosCadeiraRodas(rs.getString("ProtesePinosCadeiraRodas"));
            sb.setDescConvulcao(rs.getString("DescConvulsao"));
            sb.setDoencasPassadas(rs.getString("DoencasPassadas"));
            sb.setOutrasDoencas(rs.getString("OutrasDoencas"));
            sb.setInternacao(rs.getString("Internacao"));
            sb.setBenzetacil(rs.getString("Benzetacil"));
            sb.setMedicamentoFebre(rs.getString("MedicamentoFebre"));
            sb.setDescConvenio(rs.getString("DescConvenio"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void UpdateSaude(SaudeBean sb){
    
        try {
            String sql = "Update tblSaude set DecMedic = ?, DescAlergia = ?, ProbRespiratorio = ?, DescCardiaco = ?, "
                    + "DescNeurologico = ?, AcompanhamentoNeuro = ?, DescRestri = ?, RefluxoGastroesofagico = ?, UsoSonda = ?,"
                    + "DescPomada = ?, DeficienciaMotora = ?, DescMotor = ?, ProtesePinosCadeiraRodas = ?, DescConvulsao = ?,"
                    + "DoencasPassadas = ?, OutrasDoencas = ?, Internacao = ?, Benzetacil = ?, MedicamentoFebre = ?, "
                    + "DescConvenio = ? where fk_aluno7 = ?";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getDecMedic());
            pst.setString(2, sb.getDescAlergia());
            pst.setString(3, sb.getProbRespiratorio());
            pst.setString(4, sb.getDescCardiaco());
            pst.setString(5, sb.getDescNeurologico());
            pst.setString(6, sb.getAcompanhamentoNeuro());
            pst.setString(7, sb.getDescRestri());
            pst.setString(8, sb.getRefluxoGastroesofagico());
            pst.setString(9, sb.getUsoSonda());
            pst.setString(10, sb.getDescPomada());
            pst.setString(11, sb.getDeficienciaMotora());
            pst.setString(12, sb.getDescMotor());
            pst.setString(13, sb.getProtesePinosCadeiraRodas());
            pst.setString(14, sb.getDescConvulcao());
            pst.setString(15, sb.getDoencasPassadas());
            pst.setString(16, sb.getOutrasDoencas());
            pst.setString(17, sb.getInternacao());
            pst.setString(18, sb.getBenzetacil());
            pst.setString(19, sb.getMedicamentoFebre());
            pst.setString(20, sb.getDescConvenio());
            pst.setString(21, sb.getFk_aluno7());
            
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
//    public void GeraRelSaude(String id){
//    try {
//            Map parametro = new HashMap();
//            parametro.put("id",id);
//            JasperPrint print=JasperFillManager.fillReport("src/Relatorios/InfoSaude.jasper", parametro,c);
//            JasperViewer jv = new JasperViewer(print,false);
//            jv.setTitle("Aluno");
//            jv.setVisible(true);
//        } catch (JRException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
