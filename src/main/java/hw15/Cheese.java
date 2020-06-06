package hw15;


public class Cheese extends Milk implements RennetExtract,Vitamins{

    private String name;
    private String country;
    private double weight;

    public Cheese(int fat, String name, String country, double weight) {
        super(fat);
        this.name = name;
        this.country = country;
        this.weight = weight;
    }

    @Override
    public void rennetExtract() {

        System.out.println("Cheese contains:  % of rennet extract.");

    }

    @Override
    public void vitaminComposition() {

        System.out.println(name);
        System.out.println("Vitamin composition: A: 5mg, B: 10mg");


    }


}
