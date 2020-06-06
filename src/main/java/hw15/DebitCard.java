package hw15;

public class DebitCard extends CreditCard implements Card{
    private int balance;

    public DebitCard(Type type, String owner, int number, int balance) {
        super(type, owner, number);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void print() {
        System.out.println("\nDebit Card" + "\nType = " + type + "\nOwner = " + owner + "\nNumber = " + number + "\nBalance = " + balance);
    }
}
