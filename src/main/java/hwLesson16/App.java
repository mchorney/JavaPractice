package hwLesson16;
//Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//        добавьте в каждый ArrayList по 4 элемента
//        попробуйте методы add/set/remove/get/foreach


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        //Create new collections
        ArrayList <Mercedes> mercedes = new ArrayList<Mercedes>();
        //Add new Elements
        Mercedes a150 = new Mercedes("A150","I4 turbo",4);
        mercedes.add(a150);
        Mercedes a180 = new Mercedes("A180", "I4 turbo",4);
        mercedes.add(a180);
        Mercedes c220 = new Mercedes("C220", "3.0L", 4);
        mercedes.add(c220);
        Mercedes e330 = new Mercedes("E330", "4.0L", 8);
        mercedes.add(e330);
        int count = mercedes.size();
        mercedes.forEach(x-> x.printOut());
    //-------------------------------------------------------------------------
        ArrayList <Days> busDays = new ArrayList<>();
        Days monBus = new Days(1,true);
        busDays.add(monBus);
        Days tueBus = new Days(2,true);
        busDays.add(tueBus);
        Days wedBus = new Days(3, false);
        busDays.add(wedBus);
        Days thursBus = new Days(4,true);
        busDays.add(thursBus);
        Days friBus = new Days(5,true);
        busDays.add(friBus);
        busDays.forEach(x->x.printOut());





}
}