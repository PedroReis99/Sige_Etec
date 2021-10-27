/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class MetodoConexao {
        public static void main(String[] args) {
                    conector();
    }
        
        //psvm + TAB inclui o método principal, se digitar ele manualmente o netbeans não reconhece.
    
    public static Connection conector(){
        
        java.sql.Connection conexao = null;
        String Driver="com.mysql.cj.jdbc.Driver";
//        //ip da maquina que contem o banco
//        String url="jdbc:mysql://31.220.63.196:3306/Beta2";
//        String user="Sige";
//        String password="sige2019cotia06702810";
        String url="jdbc:mysql://localhost:3306/Beta2"
                + "?useTimezone=true&serverTimezone=UTC";
        String user="root";
        String password="090399";
        
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(url, user, password);
        System.out.println("Conexão realizada com sucesso");
        return conexao;
        }  
        
        catch(Exception e){
        //a linha abaixo serve de apoio para esclarecer o erro
        
        System.out.println(e);
                        System.out.println("Erro de conexão");
//                        JOptionPane.showMessageDialog(null, "Não foi possivel se conctar aos serviços do Si.G.E","Atenção",
//                                JOptionPane.ERROR_MESSAGE);
                return null;
        
        
        }
    }

    public static Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
}
