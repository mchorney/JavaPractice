package hw14;

import java.util.Arrays;

public class Clothes {
    protected String brand;
    protected String model;
    protected Types[] type ;
    protected Colors[] color;
    protected int collectionOfyear;
    protected MadeIn madeIn;



    public Clothes(String brand, String model, Types[] type, Colors[] color, int collectionOfyear, MadeIn madeIn) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.collectionOfyear = collectionOfyear;
        this.madeIn = madeIn;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Types[] getType() {
        return type;
    }

    public void setType(Types[] type) {
        this.type = type;
    }

    public Colors[] getColor() {
        return color;
    }

    public void setColor(Colors[] color) {
        this.color = color;
    }

    public int getCollectionOfyear() {
        return collectionOfyear;
    }

    public void setCollectionOfyear(int collectionOfyear) {
        this.collectionOfyear = collectionOfyear;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "Clothes{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", type=" + Arrays.toString(type) +
            ", color=" + Arrays.toString(color) +
            ", collectionOfyear=" + collectionOfyear +
            ", madeIn=" + madeIn +
            '}';
    }
}
