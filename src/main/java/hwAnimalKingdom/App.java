package hwAnimalKingdom;

public class App {
    public static void main(String[] args) {
        Lion lion = new Lion(Sex.MALE);
        Lion babylion = (Lion) lion.reproduce();
        boolean ok = lion.hunt(babylion);
        if (ok) {
            System.out.println("Hunt was successful!");
        } else {
            System.out.println("Hunt has faild!");
        }

        lion.breath();
        Mammals[] mammals = new Mammals[]{
                (Lion) lion.reproduce(),
                (Lion) lion.reproduce(),
                babylion,
                lion,
                lion
        };

        lion.feedMilk(mammals);

        System.out.println("Lifespan: " + lion.getLifeSpan());

        System.out.println("Lion sex: " + lion.getSex());
        System.out.println("Baby lion sex: " + babylion.getSex());

        Antelope antelopeGnu = new Antelope(Sex.MALE, "Bamby");
        Antelope babyAntelopeGnu = (Antelope) antelopeGnu.reproduce();
        System.out.println(babyAntelopeGnu);

        antelopeGnu.breath();
        antelopeGnu.die();
        antelopeGnu.getLifeSpan();

        lion.hunt(new Antelope(Sex.FEMALE, "Zina"));
        lion.hunt(antelopeGnu);

        System.out.println("Antelope " + antelopeGnu.eatGrass(8) + " kg eat grass.");

        Worm worm = new Worm(6);
        worm.breath();
        worm.getLifeSpan();
        worm.getSex();
        lion.hunt(worm);
        worm.die();


    }
}
