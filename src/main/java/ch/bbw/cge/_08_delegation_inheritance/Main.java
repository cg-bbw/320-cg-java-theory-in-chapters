package ch.bbw.cge._08_delegation_inheritance;

public class Main {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("City EV", 58);
        electricCar.printDescription();
        electricCar.charge();

        NotificationService notificationService = new NotificationService(new EmailSender());
        notificationService.sendWelcomeMessage("learner@example.com");
    }
}
