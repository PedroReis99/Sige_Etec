/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.ComportamentoBean;
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
public class ComportamentoDAO {
    private Connection c;
    
    public ComportamentoDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarComportamento(ComportamentoBean cb){
    
        String sql = "insert into tblComportamento(DescComportamento, Amigavel, TrabSoloGrupo, Frustracao, AjudaColega, "
                + "AdaptaNovoGptrab, ContatoAmigos, fk_aluno8)values(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, cb.getDescComportamento());
            pst.setString(2, cb.getAmigavel());
            pst.setString(3, cb.getTrabSoloGrupo());
            pst.setString(4, cb.getFrustracao());
            pst.setString(5, cb.getAjudaColega());
            pst.setString(6, cb.getAdaptaNovoGptrab());
            pst.setString(7, cb.getContatoAmigos());
            pst.setString(8, cb.getFk_aluno8());
            //Executa os inserts
            pst.execute();
            //fecha a conexão
            pst.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisaComportamento(ComportamentoBean cb){
            try {
            String sql = "select*from tblComportamento where fk_aluno8 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, cb.getFk_aluno8());
            ResultSet rs = pst.executeQuery();
            rs.next();
            cb.setDescComportamento(rs.getString("DescComportamento"));
            cb.setAmigavel(rs.getString("Amigavel"));
            cb.setTrabSoloGrupo(rs.getString("TrabSoloGrupo"));
            cb.setFrustracao(rs.getString("Frustracao"));
            cb.setAjudaColega(rs.getString("AjudaColega"));
            cb.setAdaptaNovoGptrab(rs.getString("AdaptaNovoGptrab"));
            cb.setContatoAmigos(rs.getString("ContatoAmigos"));
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
//    public void GeraRelComportamento(String id){
//        try {
//            Map parametro = new HashMap();
//            parametro.put("id",id);
//            JasperPrint print=JasperFillManager.fillReport("src/Relatorios/report1.jasper", parametro,c);
//            JasperViewer jv = new JasperViewer(print,false);
//            jv.setTitle("Aluno");
//            jv.setVisible(true);
//        } catch (JRException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
