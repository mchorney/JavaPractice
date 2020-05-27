package hw10;

public class Game {
    public String name;
    public int numberOfPlayers;
    public String ageCategory;
    public int price;

    public void play() {
        System.out.println("Play the game " + name);
    }

    public void win() {
        System.out.println("Congrats! You won the game " + name);
    }

    public void lose() {
        System.out.println("Sorry! You lost in game " + name);
    }
}
