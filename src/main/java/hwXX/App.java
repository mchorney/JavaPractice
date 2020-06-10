package hwXX;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Doctor> dcs = new ArrayList<>();
        dcs.add(new Doctor());
        dcs.add(new Doctor());
        Hospital h = new Hospital(dcs);
    }
}
