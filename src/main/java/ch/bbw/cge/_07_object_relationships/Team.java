package ch.bbw.cge._07_object_relationships;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final String name;
    private final List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return List.copyOf(players);
    }
}
