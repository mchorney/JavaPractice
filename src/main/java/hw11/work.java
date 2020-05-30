package hw11;

public class work {
    public static void main(String[] args) {
        String [] pl = {"Denver" , "Paris" , "Moscow"};
        int [] pr = {25, 50, 75, 100, 125, 150, 200};
        String[] gn = {"History","Drama"};
        Performances Anastasia = new Performances("Anastasia",pl,gn,pr);
        Anastasia.printOut();

        // Break

        int[] ds = {0,5,10,15,20};
        Laptops Asus = new Laptops();
        Asus.setBrand("Asus");
        Asus.setModel("ROG Zephyrus G");
        Asus.setYear(2020);
        Asus.setParameters("AMD Ryzen 7 - 16GB Memory - NVIDIA GeForce GTX 1660 Ti Max-Q - 512GB SSD");
        Asus.setDiscount(ds);
        Asus.printOut();

        // Break

        double[] v = {10.1, 10.4, 11.1, 13.7, 14.2};
        String[] rq = {"16 GB Memory" , "NVIDIA GeForce GTX 1660", "Minimum 512GB SSD"};
        Software Photoshop = new Software("Adobe","Photoshop", rq, v);
        Photoshop.printOut();
    }
}
