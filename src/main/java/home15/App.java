package home15;

public class App {
    public static void main(String[] args) {
        Cake chocolate =new Cake("Dark night",Type.CHOCOLATE,2000);
        chocolate.printMe();

        Flour f1=new Cake("Night",Type.CHOCOLATE,3000);
        Chocolate ch=new Cake("Air",Type.CHOCOLATEMUSS,1000);


        Maffin maffin =new Maffin("Ymm",16,Color.BROWN);
        maffin.printMe();

        Chocolate cho =new Maffin("Sweete",24,Color.DARK);
        maffin.madeofCocoabeans();


    }
}
