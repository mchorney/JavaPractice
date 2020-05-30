package hw11_Getter_Setter;

public class Table {
    private String[] material;
    private int desktop;
    private int legs;
    private int shelves;


    public Table() {}
    public Table(int desktop, int legs, int shelves) {
        this.desktop = desktop;
        this.legs = legs;
        this.shelves = shelves;
    }

    public void setDesktop(int desktop) {
        this.desktop = desktop;
    }
    public int getDesktop() {
        return desktop;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }
    public double getShelves() {
        return shelves;
    }

    public void setMaterial(String[] material) {
        this.material = material;
    }
    public String[] getMaterial() {
        return material;
    }


    public void printClass(Table t) {
        System.out.println("Your order is " + t.printArrays(t) + " table with " + t.getLegs() + " legs " + t.getDesktop() + " desktop and " + t.getShelves() + " shelves." );
    }
    public String printArrays(Table t) {
        String s = new String();
        for (String tm : t.getMaterial()) {
            s += tm + " ";
        }
        return s;
    }

}
