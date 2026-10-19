package ch.bbw.cge._07_object_relationships;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Electric Compact");
        car.start();

        Player firstPlayer = new Player("Sam");
        Player secondPlayer = new Player("Lee");

        Team team = new Team("Blue Team");

        team.addPlayer(firstPlayer);
        team.addPlayer(secondPlayer);

        System.out.println("Players: " + team.getPlayers());
    }
}
