package homework14;

public class App {

    public static void main(String[] args) {
        myPersonalAccount payPalAccount = new PayPalAccount("Masha", "Ivanova", "Main str", "223-44-45", "email@email.com", 222.0, 56667);
        ((PayPalAccount) payPalAccount).showStatement();
        myPersonalAccount bankAccount = new BankAccount("Ivan", "Petrov", "Bellevue Way", "345-65-34", "email@email.com", 334.0, 344456);
        ((BankAccount) bankAccount).showStatement();
        myPersonalAccount amazonAccount = new AmazonAccount("Petr", "Petrov", "King str", "234-65-67", "email@email.com", 343);
        amazonAccount.myAccountInfo();

    }
}
