package hwFinalProject;

public class Work {
    public static void main(String[] args) {
        Lion lion = new Lion("White lion", 3);
        System.out.println(lion.toString());
        lion.canBreathe();
        lion.canMove();
        lion.eatingFlesh();
        lion.warmBloodedMilkFeed();
        lion.haveBackbone();
        System.out.println("****************************************");


        Wolf wolf = new Wolf("Arctic wolf", 7);
        System.out.println(wolf.toString());
        wolf.canBreathe();
        wolf.canMove();
        wolf.eatingFlesh();
        wolf.warmBloodedMilkFeed();
        wolf.haveBackbone();
        System.out.println("****************************************");


        BlueWhale bluewhale = new BlueWhale("Roni", 56);
        System.out.println(bluewhale.toString());
        bluewhale.canBreathe();
        bluewhale.canMove();
        bluewhale.eatingFlesh();
        bluewhale.warmBloodedMilkFeed();
        bluewhale.haveBackbone();


    }
}
