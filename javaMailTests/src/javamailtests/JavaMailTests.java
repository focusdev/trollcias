
package javamailtests;

import java.io.UnsupportedEncodingException;
import javax.mail.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Proyecto para Realizar pruebas sobre la API de JavaMail
 * @author Rafuru
 */
public class JavaMailTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String username="correo@mail.com";
        final String password="conantesputo";
        
        Properties props=new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");
        Authenticator auth=new Authenticator(){
            protected PasswordAuthentication getPasswordAuth(){
                return new PasswordAuthentication (username, password.toCharArray());
            }
        };
        Session session = Session.getDefaultInstance(props, auth);
        
        try{
            Message message =new MimeMessage(session);
            message.setFrom(new InternetAddress("masterxp79@gmail.com","Rafael"));
            message.setRecipient(Message.RecipientType.TO,
                    new InternetAddress("rcarrillorosario@gmail.com"));
            message.setSubject("Hola javaMail");
            message.setText("Mensaje de prueba fuck yea");
            Transport t =session.getTransport("smtp");
            t.connect(username, password);
            t.sendMessage(message,message.getAllRecipients());
            System.out.println("Enviado");
            t.close();
        }catch(MessagingException e){
            System.out.println(e.getMessage());
        }catch(UnsupportedEncodingException uee){
            
        }
    }
}
