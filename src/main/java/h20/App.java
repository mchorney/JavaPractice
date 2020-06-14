package h20;

public class App {
    public static void main(String[] args) {
        Lion lion = new Lion("King",100);
        System.out.println(lion.toString());
        lion.canBreath();
        lion.multicellular();
        lion.haveaSpinalColumn();
        lion.nursingTheirYoung();
        lion.eatmyPrey();
        System.out.println("*************************************");

        Wolf wolf = new Wolf("Grey wolf",50,"grey");
        wolf.printMe();
        wolf.canBreath();
        wolf.multicellular();
        wolf.haveaSpinalColumn();
        wolf.nursingTheirYoung();
        wolf.eatmyPrey();
        System.out.println("*************************************");

        BlueWhale whale = new BlueWhale("Big Boss",100000,"blue & white");
        whale.printMe();
        whale.multicellular();
        whale.haveaSpinalColumn();
        whale.nursingTheirYoung();
        whale.eatmyPrey();
        whale.canBreath();
        System.out.println("*************************************");

    }
}
