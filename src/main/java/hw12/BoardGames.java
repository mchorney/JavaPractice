package hw12;

import java.util.Arrays;

public class BoardGames {
    private String name;
    private GameType[] type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameType[] getType() {
        return type;
    }

    public void setType(GameType[] type) {
        this.type = type;
    }

    public BoardGames(String name, GameType[] type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "BoardGames {" +
                "Name = '" + name + '\'' +
                ", Type = " + Arrays.toString(type) +
                '}';
    }
}
