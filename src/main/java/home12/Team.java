package home12;

import java.util.Arrays;

public class Team {
    private Game[] players;
    private State home;

    public Team(Game[] players,State home) {
        this.players = players;
        this.home=home;
    }

    public Team() {
    }

    public Game[] getPlayers() {
        return players;
    }

    public void setPlayers(Game[] players) {
        this.players = players;
    }

    public State getHome() {
        return home;
    }

    public void setHome(State home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", home=" + home +
                '}';
    }
}
