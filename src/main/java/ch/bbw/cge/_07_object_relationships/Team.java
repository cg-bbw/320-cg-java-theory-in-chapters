package ch.bbw.cge._07_object_relationships;

public class Team {

    private final String name;
    private final Player firstPlayer;
    private final Player secondPlayer;

    public Team(String name, Player firstPlayer, Player secondPlayer) {
        this.name = name;

        // The Player objects already exist independently and are handed to the Team.
        // This models aggregation in this example.
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getDescription() {
        return name + ": " + firstPlayer.getName() + " and " + secondPlayer.getName();
    }
}
