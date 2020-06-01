package hw12;

public class Enums {
    public static void main(String[] args) {

        Garden waukee= new Garden("Waukee Orchrads", Trees.APPLE,"5315 150 Street, Waukee");
        System.out.println(waukee);

        Pensils bic= new Pensils(new PensilColor[]{PensilColor.BLACK,PensilColor.BROWN,PensilColor.GREEN,PensilColor.RED},"BIC",24);
        System.out.println(bic);

    }
}
