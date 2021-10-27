/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.OcorrenciaBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dell
 */
public class OcorrenciaDAO {
    private Connection c;
    
    public OcorrenciaDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarOcorrencia(OcorrenciaBean ob){
    
        String sql ="insert into tblOcorrencia(TipoDeOcorrencia, Descricao, fk_aluno10)"
                + "values(?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ob.getTipodeOcorrencia());
            pst.setString(2, ob.getDescricao());
            pst.setString(3, ob.getFk_aluno10());
            //Executa o Insert
            pst.execute();
            //fecha a conexao
            pst.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public List<OcorrenciaBean>listar(OcorrenciaBean ob){
    
        String sql = "select*from tblOcorrencia where fk_aluno10 =?";
        
        try {
            List<OcorrenciaBean>ocorrencia = new ArrayList<OcorrenciaBean>();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ob.getFk_aluno10());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ob.setId_ocorrencia(rs.getString("Id_Ocorrencia"));
                ob.setTipodeOcorrencia(rs.getString("TipodeOcorrencia"));
                ob.setDescricao(rs.getString("Descricao"));
                ob.setDataDaOcorrencia(rs.getDate("DataDaOcorrencia"));
                ocorrencia.add(ob);
            }
            rs.close();
            pst.close();
            return ocorrencia;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    
//    public void GeraRelOcorrencia(String id){
//        try {
//            Map parametro = new HashMap();
//            parametro.put("id",id);
//            JasperPrint print=JasperFillManager.fillReport("src/Relatorios/InfoOcorrencia.jasper", parametro,c);
//            JasperViewer jv = new JasperViewer(print,false);
//            jv.setTitle("Aluno");
//            jv.setVisible(true);
//        } catch (JRException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
