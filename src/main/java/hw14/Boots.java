package hw14;

public class Boots extends Shoes {
    private Material material;
    boolean zip;

    public Boots(String brand, Size size, ForWho gender, Season season, int price, Material material, boolean zip) {
        super(brand, size, gender, season, price);
        this.material = material;
        this.zip = zip;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public boolean isZip() {
        return zip;
    }

    public void setZip(boolean zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "material=" + material +
                ", zip=" + zip +
                ", Brand='" + Brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", season=" + season +
                ", price=$" + price +
                '}';
    }
}
