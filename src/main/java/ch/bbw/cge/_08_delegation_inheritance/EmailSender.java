package ch.bbw.cge._08_delegation_inheritance;

public class EmailSender {

    public void send(String address, String text) {
        System.out.println("Email to " + address + ": " + text);
    }
}
