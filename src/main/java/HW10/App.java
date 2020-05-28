package HW10;

public class App {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.department = "Construction";
        worker1.id = 112;
        worker1.isBusyStatus = false;

        Worker worker = new Worker();
        worker.department = "Delivery";
        worker.id = 232;
        worker.isBusyStatus = true;

        worker.readyToWork();
        worker.startWork(worker);
        worker.startWork(worker1);

        SmartKey sm = new SmartKey();
        sm.lastName = "Parker";
        sm.firstName = "Piter";
        sm.membershipStatus = true;

        SmartKey sm1 = new SmartKey();
        sm1.lastName = "Person";
        sm1.firstName = "Unknown";
        sm1.membershipStatus = false;

        sm.welcome(sm);
        sm1.welcome(sm1);

        Table table = new Table();
        table.material = table.material.Wood;
        table.legs = 3;
        table.desktop = 0;
        table.shelves = 2;
        Table table1 = new Table();
        table1.material = table.material.Plastic;
        table1.legs = 4;
        table1.desktop = 1;
        table1.shelves = 2;

        table.isOrderAccepted(table);
        table1.isOrderAccepted(table1);
        table1.yourOrder(table1);


        GroceryBasket gb = new GroceryBasket();
        gb.productName = "Ice-Cream";
        gb.amount = 2;
        gb.price = 1.5;
        gb.isPayed = true;

        GroceryBasket gb1 = new GroceryBasket();
        gb1.productName = "Donut";
        gb1.amount = 12;
        gb1.price = 0.5;
        gb1.isPayed = false;

        gb.checkOut(gb);
        gb1.checkOut(gb1);
    }
}