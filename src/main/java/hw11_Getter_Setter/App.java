package hw11_Getter_Setter;


public class App {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setId(12);
        String[] dep = {"Construction", "Delivery", "Engineering"};
        worker.setDepartments(dep);
        worker.setRate(35.7);
        worker.setBusyStatus(true);

        Worker worker2 = new Worker(15, dep, 38.7);

        worker.printClass(worker);
        worker2.printClass(worker2);


        GroceryBasket gb = new GroceryBasket();
        gb.setAmount(3);
        String[] pName = {"Milk", "Sugar", "SoftDrink"};
        gb.setProductsName(pName);
        gb.setPrice(3.5);
        gb.setPayed(true);

        GroceryBasket gb1 = new GroceryBasket();
        gb1.setAmount(8);
        gb1.setProductsName(pName);
        gb1.setPrice(5.8);
        gb1.setPayed(false);

        gb.printClass(gb);
        gb1.printClass(gb1);

        Table table = new Table();
        String[] mat = {"Wood", "Plastic", "Steel"};
        table.setMaterial(mat);
        table.setLegs(3);
        table.setDesktop(1);
        table.setShelves(3);
        Table table1 = new Table();
        table1.setMaterial(mat);
        table1.setLegs(6);
        table1.setDesktop(3);
        table1.setShelves(8);

        table.printClass(table);
        table1.printClass(table1);
    }
}