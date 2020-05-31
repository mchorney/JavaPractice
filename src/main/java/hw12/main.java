package hw12;

public class main {
    public static void main(String[] args) {
        BoardGames catan = new BoardGames("Catan",new GameType[]{GameType.Strategy,GameType.Action});
        System.out.println(catan);
        MusicalInstruments piano = new MusicalInstruments("Piano", InstrumentFamily.KEYBOARD);
        System.out.println(piano);
    }
}
