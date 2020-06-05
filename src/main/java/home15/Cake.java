package home15;

public class Cake implements Chocolate,Flour{
    private String name;
    private Type type;
    private int weight;

    public Cake(String name, Type type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public void sweet(){

    }

    @Override
    public void madeofCocoabeans(){

    }
    @Override
    public void white(){

    }
    @Override
    public void wheat(){

    }
    public void printMe(){
        System.out.println("Cake is called "+name+" this cake is "+type+" cake weighs "+weight);
    }
}
