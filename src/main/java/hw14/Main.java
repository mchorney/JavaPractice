package hw14;

public class Main {
    public static void main(String[] args) {
        Store rnb = new Store("Red and Black","Pearl street","Boulder", "CO", 50098, 966584);
        Game dragonAge = new ComputerGame("Dragon Age", 2009, Type.RPG,1,"Windows 10, NVIDIA GEForce, Intel i7",rnb);
        dragonAge.printInfo();

        Store bb = new Store("Black's books", "Westminster abbey", "Westminster", "London", 657522, 89756465);
        Game ah = new BoardGame("Arkham Horror", 2014, Type.HORROR,"Joker", 6,"Call of Cthulhu", bb);
        ah.printInfo();
    }
}
