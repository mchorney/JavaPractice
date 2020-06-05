package home15;

public class Maffin implements Chocolate{
    private String name;
    private int number;
    private Color color;

    public Maffin(String name, int number, Color color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }
    @Override
    public void sweet(){

    }

    @Override
    public void madeofCocoabeans(){
        System.out.println("Maffins mith chokolate made from cocoa beans");

    }
    public void printMe(){
        System.out.println("Maffins "+name+" of "+number+" they are"+color+" color");
    }
}
