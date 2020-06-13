package hwAnimalKingdom;

public class App {
    public static void main(String[] args) {
        Lion lion= new Lion(Sex.MALE);
        Lion babylion= (Lion) lion.reproduce();
        boolean ok=lion.hunt(babylion);
        if(ok){
            System.out.println("Hunt was successful!");
        }else {
            System.out.println("Hunt has faild!");
        }

        lion.breath();
        Mammals[] mammals= new Mammals[]{
                (Lion)lion.reproduce(),
                (Lion)lion.reproduce(),
                babylion,
                lion,
                lion
        };

        lion.feedMilk(mammals);

        System.out.println("Lifespan: "+lion.getLifeSpan());

        System.out.println("Lion sex: "+lion.getSex());
        System.out.println("Baby lion sex: "+ babylion.getSex());

        Antelope antelopeGnu= new Antelope(Sex.MALE);
        Antelope babyAntelopeGnu=(Antelope) antelopeGnu.reproduce();
        System.out.println(babyAntelopeGnu);
        antelopeGnu.breath();
        antelopeGnu.die();
        antelopeGnu.getLifeSpan();

        lion.hunt(new Antelope(Sex.FEMALE));

        System.out.println(antelopeGnu.eatGrass(8));


    }
}
