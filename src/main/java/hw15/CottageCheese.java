package hw15;

public class CottageCheese extends Milk implements RennetExtract, Vitamins {

    private String flavor;
    private String size;
    private boolean sodium_free;

    public CottageCheese(int fat, String flavor, String size, boolean sodium_free) {
        super(fat);
        this.flavor = flavor;
        this.size = size;
        this.sodium_free = sodium_free;
    }

    @Override
    public void rennetExtract() {
        System.out.println("Cottage cheese contains: ");
    }

    @Override
    public void vitaminComposition() {
        System.out.println("Cottage cheese vitamin composition: D: 11mg, C: 10mg ");

    }
}
