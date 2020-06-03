package hw14;

public class Sneakers extends Shoes {
    private String Model;
    private TypeOfSnickers typeOfSnickers;
    public boolean laced;

    public Sneakers(String brand, Size size, ForWho gender, Season season, int price, String model, TypeOfSnickers typeOfSnickers, boolean laced) {
        super(brand, size, gender, season, price);
        Model = model;
        this.typeOfSnickers = typeOfSnickers;
        this.laced = laced;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public TypeOfSnickers getTypeOfSnickers() {
        return typeOfSnickers;
    }

    public void setTypeOfSnickers(TypeOfSnickers typeOfSnickers) {
        this.typeOfSnickers = typeOfSnickers;
    }

    public boolean isLaced() {
        return laced;
    }

    public void setLaced(boolean laced) {
        this.laced = laced;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "Model='" + Model + '\'' +
                ", typeOfSnickers=" + typeOfSnickers +
                ", laced=" + laced +
                ", Brand='" + Brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", season=" + season +
                ", price=$" + price +
                '}';
    }
}
