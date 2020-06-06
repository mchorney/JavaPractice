package hw15;

public class Main {
    public static void main(String[] args) {
        Card is = new DebitCard(Type.VISA,"Irina Sidorova", 440068098, 100000);
        Card is2 = new CreditCard(Type.DISCOVER,"Irina Sidorova",456712098);
        is.print();
        is2.print();
    }
}
