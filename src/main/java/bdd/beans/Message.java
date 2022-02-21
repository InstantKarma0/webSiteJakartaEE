package bdd.beans;

import java.util.Date;

public class Message {

    private String mail;
    private String message;
    private Date datetime;

    public Message(String mail, String message, Date datetime) {
        this.mail = mail;
        this.message = message;
        this.datetime = datetime;
    }

    public Message(String mail, String message) {
        this.mail = mail;
        this.message = message;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
