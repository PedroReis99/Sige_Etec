/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.PartoBean;
import Conector.MetodoConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class PartoDAO {
    
    private Connection c;
    
    public PartoDAO(){
    
        c = new MetodoConexao().conector();
    }
    
    public void AdicionarParto(PartoBean pb){
    
        String sql = "insert into tblParto(LocalPar, Peso, Altura, Duracao, DesenvPar, Anestesia, TipoAnes,"
                + "Choro, Roxo, Ictericia, Incubadora, DiasIncub, fk_aluno4)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
        
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, pb.getLocalPar());
            pst.setString(2, pb.getPeso());
            pst.setString(3, pb.getAltura());
            pst.setString(4, pb.getDuracao());
            pst.setString(5, pb.getDesenvPar());
            pst.setString(6, pb.getAnestesia());
            pst.setString(7, pb.getTipoAnes());
            pst.setString(8, pb.getChoro());
            pst.setString(9, pb.getRoxo());
            pst.setString(10, pb.getIctericia());
            pst.setString(11, pb.getIncubadora());
            pst.setString(12, pb.getDiasIncub());
            pst.setString(13, pb.getFk_aluno4());
            //Executa os inserts
            pst.execute();
            // Fechar a conexão
            pst.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisaParto(PartoBean pb){
        try {
            String sql = "select*from tblParto where fk_aluno4 = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, pb.getFk_aluno4());
            ResultSet rs = pst.executeQuery();
            rs.next();
            pb.setLocalPar(rs.getString("LocalPar"));
            pb.setPeso(rs.getString("Peso"));
            pb.setAltura(rs.getString("Altura"));
            pb.setDuracao(rs.getString("Duracao"));
            pb.setDesenvPar(rs.getString("DesenvPar"));
            pb.setAnestesia(rs.getString("Anestesia"));
            pb.setTipoAnes(rs.getString("TipoAnes"));
            pb.setChoro(rs.getString("Choro"));
            pb.setRoxo(rs.getString("Roxo"));
            pb.setIctericia(rs.getString("Ictericia"));
            pb.setIncubadora(rs.getString("Incubadora"));
            pb.setDiasIncub(rs.getString("DiasIncub"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
