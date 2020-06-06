package hw15;

public class CreditCard implements Card{
    protected Type type;
    protected String owner;
    protected long number;

    public CreditCard(Type type, String owner, long number) {
        this.type = type;
        this.owner = owner;
        this.number = number;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    @Override
    public void print() {
        System.out.println("\nCredit Card" + "\nType = " + type + "\nOwner = " + owner +"\nNumber = " + number);
    }
}
