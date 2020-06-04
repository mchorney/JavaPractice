package hm14;

public class App {
    public static void main(String[] args) {
        Employee1 briana = new Employee1(CompanyName.NETFLIX, "Alameda st, Los Angeles", "7473442356", "Briana", "Gomez");
        briana.printMe();
        System.out.println(briana);

        Employee2 gerald = new Employee2(CompanyName.AMAZON, "Victory st, Lost Angeles", "7473445678", "Gerald", "White");
        gerald.printMe();

    }
}
