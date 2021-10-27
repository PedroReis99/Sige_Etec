
package DAL;

import Bean.AlunoBean;
import Conector.MetodoConexao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoDAO {
    
    private Connection c;
    
    public AlunoDAO(){
    
        c=new  MetodoConexao().conector();
    }
    
    public void AdicionarAluno(AlunoBean ab){
    
        String sql = "insert into tblAluno(Id_aluno, NomeAluno, RG, Genero, DtNasc, Serie, Foto, Periodo, Fk_escola)  "
                + "values( ?, ?, ?, ?, ?, ?, ?, ?,?)";
        try{
            FileInputStream fis =new FileInputStream(new File(ab.getCaminho()));
            
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, ab.getId_aluno());
            stmt.setString(2, ab.getNomeAluno());
            stmt.setString(3, ab.getRG());
            stmt.setString(4, ab.getGenero());
            stmt.setDate(5, ab.getDtNasc());
            stmt.setString(6, ab.getSerie());
            stmt.setBlob(7, fis);
            stmt.setString(8, ab.getPeriodo());
            stmt.setString(9, ab.getFk_escola());
            // Método para executar a inserção de informações no banco de dados
            stmt.execute();
            // Fecha a conexão com o banco de dados
            stmt.close();
            
        
        }catch(SQLException ex){
            throw new RuntimeException(ex);
//            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a matricula....         "
//                    + "\n Por favor verifique a conexão com a internete",
//                    "Aviso!",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(FileNotFoundException e){
        
        }
    }
    
    public List<AlunoBean>listar(String query){
    
        String sql = "select Id_aluno, NomeAluno, Genero,  year(curdate())-year(DtNasc) , Serie, Periodo,"
                + "Foto from tblAluno "+ query;
        try {
            List<AlunoBean>alunos = new ArrayList<AlunoBean>();
            PreparedStatement pst =c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                AlunoBean ab = new AlunoBean();
                ab.setId_aluno(rs.getString("Id_aluno"));
                ab.setNomeAluno(rs.getString("NomeAluno"));
                ab.setGenero(rs.getString("Genero"));
                ab.setData(rs.getString("year(curdate())-year(DtNasc)"));
                ab.setSerie(rs.getString("Serie"));
                ab.setPeriodo(rs.getString("Periodo"));
                ab.setFoto(rs.getBlob("Foto"));
                alunos.add(ab);
                }
            rs.close();
            pst.close();
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    public List<AlunoBean>turma(String query){
        
        String sql = "select Id_aluno, NomeAluno, Serie, Periodo from tblAluno "+query;
        try {
            List<AlunoBean>alunos = new ArrayList<AlunoBean>();
            PreparedStatement pst =c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                AlunoBean ab = new AlunoBean();
                ab.setId_aluno(rs.getString("Id_aluno"));
                ab.setNomeAluno(rs.getString("NomeAluno"));
                ab.setSerie(rs.getString("Serie"));
                ab.setPeriodo(rs.getString("Periodo"));
                alunos.add(ab);
                }
            rs.close();
            pst.close();
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    public void UpdateAluno(AlunoBean ab){
    
        try {
            String sql = "Update tblAluno set NomeAluno = ?, Serie = ?, Foto = ? where Id_aluno = ?";
            
            FileInputStream fis =new FileInputStream(new File(ab.getCaminho()));
            
            PreparedStatement pst = c.prepareStatement(sql);
            
            pst.setString(1, ab.getNomeAluno());
            pst.setString(2, ab.getSerie());
            pst.setBlob(3, fis);
            pst.setString(4, ab.getId_aluno());
            
            pst.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Informações alteradas");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }catch(FileNotFoundException e){
        }
    }
    
    public void transferencia(AlunoBean ab){
    
        try {
            String sql = "Update tblAluno set Fk_escola =?, Periodo =? where Id_aluno =?";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ab.getFk_escola());
            pst.setString(2, ab.getPeriodo());
            pst.setString(3, ab.getId_aluno());
            
            pst.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Aluno transferido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisaTudo(AlunoBean ab){
        
        String sql = "select Foto from tblAluno where Id_aluno =" + ab.getId_aluno();
        try {
            PreparedStatement pst = this.c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    ab.setFoto(rs.getBlob("Foto"));
                }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
//    public void GeraRel(String id){
//        try {
//            Map parametro = new HashMap();
//            parametro.put("id",id);
//            JasperPrint print=JasperFillManager.fillReport("src/Relatorios/InfoAluno.jasper", parametro,c);
//            JasperViewer jv = new JasperViewer(print,false);
//            jv.setTitle("Aluno");
//            jv.setVisible(true);
//        } catch (JRException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public void GeraCiencia(String id){
//        try {
//            Map parametro = new HashMap();
//            parametro.put("id", id);
//            JasperPrint print = JasperFillManager.fillReport("src/Relatorios/CienciaMatricula.jasper", parametro, c);
//            JasperViewer jv = new JasperViewer(print, false);
//            jv.setTitle("Ciencia");
//            jv.setVisible(true);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public void GeraTranferencia(String id){
//    
//        try {
//            Map parametro = new HashMap();
//            parametro.put("id", id);
//            JasperPrint print = JasperFillManager.fillReport("src/Relatorios/CertificadoTransferencia.jasper",parametro,c);
//            JasperViewer jv = new JasperViewer(print, false);
//            jv.setTitle("Certificado de transfêrencia");
//            jv.setVisible(true);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
    
    public void PesquisaTransferencia(AlunoBean ab){
    
        try {
            String sql = "select Serie, year(curdate())-year(DtNasc), Periodo, Foto from tblAluno where Id_aluno = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ab.getId_aluno());
            ResultSet rs = pst.executeQuery();
            rs.next();
            ab.setSerie(rs.getString("Serie"));
            ab.setData(rs.getString("year(curdate())-year(DtNasc)"));
            ab.setPeriodo(rs.getString("Periodo"));
            //ab.setFoto(rs.getBlob("Foto"));
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void PesquisaSolicitacao(AlunoBean ab){
    
        try {
            String sql = "select NomeAluno, NomeResponsavel1, Email from tblAluno"
                    + " inner join tblResponsaveis on tblAluno.Id_aluno = tblResponsaveis.fk_aluno1"
                    + " inner join tblContato on tblAluno.Id_aluno = tblContato.fk_aluno2"
                    + " where Id_aluno = ?";
            
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ab.getId_aluno());
            ResultSet rs = pst.executeQuery();
            rs.next();
            
            ab.setNomeAluno(rs.getString("NomeAluno"));
            ab.setInner1(rs.getString("NomeResponsavel1"));
            ab.setInner2(rs.getString("Email"));
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

