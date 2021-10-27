/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.SonoBean;
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
public class SonoDAO {
    
    private Connection c;
    
    public SonoDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void InserirSono(SonoBean sb){
    
        String sql = "insert into tblSono(DormeBemNoite, AcordaMadrugada, DormeDia, QuntHr, fk_aluno6)"
                + "values(?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, sb.getDormeBemNoite());
            pst.setString(2, sb.getAcordaMadrugada());
            pst.setString(3, sb.getDormeDia());
            pst.setString(4, sb.getQuntHr());
            pst.setString(5, sb.getFk_aluno6());
            //Executa o insert
            pst.execute();
            //fecha a conexão e finaliza o insert
            pst.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisaSono(SonoBean sb){
        try {
            String sql = "select*from tblSono where fk_aluno6 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, sb.getFk_aluno6());
            ResultSet rs = pst.executeQuery();
            rs.next();
            sb.setDormeBemNoite(rs.getString("DormeBemNoite"));
            sb.setAcordaMadrugada(rs.getString("AcordaMadrugada"));
            sb.setDormeDia(rs.getString("DormeDia"));
            sb.setQuntHr(rs.getString("QuntHr"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
//    public void GeraRelCreche(String id){
//        try {
//            Map parametro = new HashMap();
//            parametro.put("id",id);
//            JasperPrint print=JasperFillManager.fillReport("src/Relatorios/InfoCreche.jasper", parametro,c);
//            JasperViewer jv = new JasperViewer(print,false);
//            jv.setTitle("Aluno");
//            jv.setVisible(true);
//        } catch (JRException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
