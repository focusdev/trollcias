/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosInfraestructura.pedidosEnLinea;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Session;

/**
 *
 * @author Rafuru
 */
public class Mailer {
    private StringBuilder texto;
    private String para;
    private String titulo;
    
    private final String user="focus.desarrollo@gmail.com";
    private final String pswd="focus@66";
    
    private Session sesion;

    public Mailer(StringBuilder texto, String para, String titulo) {
        this.texto = texto;
        this.para = para;
        this.titulo = titulo;
    }
    
    private void iniciaServicio(){
        Properties props=new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");
        Authenticator auth=new Authenticator(){
            protected PasswordAuthentication getPasswordAuth(){
                return new PasswordAuthentication (user, pswd.toCharArray());
            }
        };
        sesion = Session.getDefaultInstance(props, auth);
    }
}
