package ch.bbw.cge._08_delegation_inheritance;

public class NotificationService {

    private final EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendWelcomeMessage(String address) {
        // Delegation means that NotificationService gives the sending task to EmailSender.
        emailSender.send(address, "Welcome to the course!");
    }
}
