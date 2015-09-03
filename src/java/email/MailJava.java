package email;

import java.util.List;
import java.util.Map;

/**
 *
 * @author a
 */
public class MailJava {
    //indica se o formato de texto será texto ou html
    public static final String TYPE_TEXT_PLAIN = "text/plain";
    public static final String TYPE_TEXT_HTML = "text/html";
    //indica qual será o servidor de email(gmail, hotmail...)         
    private String smtpHostMail;
    //indica a porta de acesso ao servidor
    private String smtpPortMail;
    //indica que a necessidade de autenticação no servidor(true ou false)
    private String smtpAuth;
    //indica ao servidor que ele está recebendo uma conexão segura
    private String smtpStarttls;
    //nome do remetente do email
    private String fromNameMail;
    //email do remetente
    private String userMail;
    //senha do email do remetente
    private String passMail;
    //assunto do email
    private String subjectMail;
    //corpo do email, onde estará o texto da mensagem
    private String bodyMail;
    //lista com email e nome dos destinatários
    private Map<String, String> toMailsUsers;
    //lista contendo os arquivos anexos
    private List<String> fileMails;
    //charset, no caso de html é necessário 
    private String charsetMail;
    //tipo do formato da mensagem, texto ou html
    private String typeTextMail;
    // gere os métodos getters and setters        

    public static String getTYPE_TEXT_PLAIN() {
        return TYPE_TEXT_PLAIN;
    }

    public static String getTYPE_TEXT_HTML() {
        return TYPE_TEXT_HTML;
    }

    public String getSmtpHostMail() {
        return smtpHostMail;
    }

    public String getSmtpPortMail() {
        return smtpPortMail;
    }

    public String getSmtpAuth() {
        return smtpAuth;
    }

    public String getSmtpStarttls() {
        return smtpStarttls;
    }

    public String getFromNameMail() {
        return fromNameMail;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getPassMail() {
        return passMail;
    }

    public String getSubjectMail() {
        return subjectMail;
    }

    public String getBodyMail() {
        return bodyMail;
    }

    public Map<String, String> getToMailsUsers() {
        return toMailsUsers;
    }

    public List<String> getFileMails() {
        return fileMails;
    }

    public String getCharsetMail() {
        return charsetMail;
    }

    public String getTypeTextMail() {
        return typeTextMail;
    }
    
    

    public void setSmtpHostMail(String smtpHostMail) {
        this.smtpHostMail = smtpHostMail;
    }

    public void setSmtpPortMail(String smtpPortMail) {
        this.smtpPortMail = smtpPortMail;
    }

    public void setSmtpAuth(String smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public void setSmtpStarttls(String smtpStarttls) {
        this.smtpStarttls = smtpStarttls;
    }

    public void setFromNameMail(String fromNameMail) {
        this.fromNameMail = fromNameMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void setPassMail(String passMail) {
        this.passMail = passMail;
    }

    public void setSubjectMail(String subjectMail) {
        this.subjectMail = subjectMail;
    }

    public void setBodyMail(String bodyMail) {
        this.bodyMail = bodyMail;
    }

    public void setToMailsUsers(Map<String, String> toMailsUsers) {
        this.toMailsUsers = toMailsUsers;
    }

    public void setFileMails(List<String> fileMails) {
        this.fileMails = fileMails;
    }

    public void setCharsetMail(String charsetMail) {
        this.charsetMail = charsetMail;
    }

    public void setTypeTextMail(String typeTextMail) {
        this.typeTextMail = typeTextMail;
    }    
}
