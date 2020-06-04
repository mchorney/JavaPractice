package homework14;

import com.sun.jdi.request.ClassUnloadRequest;
import com.sun.nio.sctp.PeerAddressChangeNotification;

public class Work {
    public static void main(String[] args) {
//        1. Создать один супер и 2 или 3 детских
//        создать объекты
//        2. Попробуйте создать функцию в супер классе и в произвлдном классе с
//        одинаковым именем и разным функционалом
//
        Address customer = new Address("2331 elm st","Charlotte",State.NC,28105);
        Address cust2 = new Address("123 central ave","Matthews",State.NC,28277);
        Box a = new Box(10,5.5,3);
        a.pack();
        WeightRoom am = new WeightRoom(10,15,15,10);
        am.pack();
        Packadge amazon = new Packadge(12,15,10,20,"Amazon",customer);
        amazon.pack();
        Packadge u = new Packadge(20,20,10,50,"UPS",cust2);
        u.pack();
    }
}
