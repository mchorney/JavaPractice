package homework14;

public class App {

    public static void main(String[] args) {
        myPersonalAccount payPalAccount = new myPayPalAccount( "Valya", "Ivanova", "Main str", "223-44-45", "email@email.com", 222.0, 56667 );
        ((myPayPalAccount) payPalAccount).showStatement();
        myBankAccount bankAccount = new myBankAccount("Ivan", "Petrov", "Bellevue Way", "345-65-34", "email@email.com", 334.0, 344456);
        bankAccount.showStatement();
    }
}
