package home10;

public class App {
    public static void main(String[] args) {
        Family daughter = new Family();
        daughter.name="Alisa";
        daughter.lastName="Filimontsava";
        daughter.age=9;
        daughter.hairColor="light brown";
        daughter.printMe();
        daughter.hello();

        Family son=new Family();
        son.name="Matthew";
        son.lastName="Filimintsau";
        son.hairColor="blond";
        son.age=1;
        son.hello();


        Bird cardinal= new Bird();
        cardinal.kindofbirds="Red Cardinal";
        cardinal.color="Red";
        cardinal.place="Minnesota";
        cardinal.weight=10;
        cardinal.live();

        Bird ibis= new Bird();
        ibis.kindofbirds="Ibis";
        ibis.color="whate";
        ibis.weight=300;
        ibis.place="Florida";
        ibis.live();


        Clothes dress=new Clothes();
        dress.kind="dress";
        dress.typeofFabric="cotton";
        dress.color="Blue";
        dress.size=8;
        dress.type();

        Clothes pants=new Clothes();
        pants.kind="pants";
        pants.typeofFabric="jeans";
        pants.color="whate";
        pants.size=8;
        pants.type();


        Game loto=new Game();
        loto.type="table";
        loto.title="Loto";
        loto.numberofPersone=4;
        loto.likeGame();

        Game uno=new Game();
        uno.type="table";
        uno.title="Uno";
        uno.numberofPersone=4;
        uno.likeGame();


    }
}
