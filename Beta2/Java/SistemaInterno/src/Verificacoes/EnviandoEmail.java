/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verificacoes;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
/**
 *
 * @author Dell
 */
public class EnviandoEmail {

    
    public void Email(String Destinatario, String Escola, String Perfil){
        String meuemail = "sigemail435@gmail.com";
        String senha="sige2019";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuemail, senha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(meuemail);
            email.setSubject("Aviso!");
            email.setMsg("Você realizou um cadastro no Si.G.E.! \n"
                    + "Você foi cadastrado na escola: "+Escola+" na função de: "+Perfil
                    + "\n Atenção, esse email foi enviado automaticamente.");
            email.addTo(Destinatario);
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EmailOcorrencia(String Email, String Nome, String Serie, String tipo){
        String meuemail = "sigemail435@gmail.com";
        String senha="sige2019";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuemail, senha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(meuemail);
            email.setSubject("Aviso!");
            email.setMsg("O Si.G.E. informa:"+"Seu/Sua filho(a): "+Nome+".\n Que está na série: "+Serie
                        +"\n Recebeu uma notificação do tipo: "+tipo
                        +" \n Este email foi enviado automaticamente");
            email.addTo(Email);
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EmailMatricula(String Email, String NomeRes, String Aluno, String Serie, String Periodo, String Escola){
        String meuemail = "sigemail435@gmail.com";
        String senha="sige2019";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuemail, senha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(meuemail);
            email.setSubject("Aviso!");
            email.setMsg("Sr(a): "+NomeRes+".\n "
                    + "Você realizou a matricula de seu/sua filho(a): "+Aluno+""
                    + "na série: "+Serie+" do periodo: "+Periodo+" da escola: "+Escola
                    +"\n Este email é enviado automaticamente!");
            email.addTo(Email);
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EmailAtual(String Email, String Escola,String Funcao){
        String meuemail = "sigemail435@gmail.com";
        String senha="sige2019";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuemail, senha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(meuemail);
            email.setSubject("Aviso!");
            email.setMsg("Seu perfil foi atualizado na escola: "+Escola+". \n"
                    + "Sua função atual é: "+Funcao);
            email.addTo(Email);
            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
