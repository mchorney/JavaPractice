package FoodChain;

public class Work {
    public static void main(String[] args) {
    Lion vasya = new Lion("Vasiliy",2003);
        System.out.println(vasya);
        vasya.developedBackbone();
        vasya.hairAndFur();
        vasya.life();
        vasya.mainChar();

        System.out.println("------------------------------------");
        Wolf nikolay = new Wolf("Nikolay",Color.GRAY);
        System.out.println(nikolay);
        nikolay.developedBackbone();
        nikolay.hairAndFur();
        nikolay.life();
        nikolay.mainChar();

        System.out.println("------------------------------------");
        Carnivores willie = new BlueWhale("Willie",25.5);
        System.out.println(willie);
        willie.developedBackbone();
        willie.hairAndFur();
        willie.life();
        willie.mainChar();

}
    }

