package l18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> xx = new ArrayList<>();
        Doctor doc = new Doctor();
        int x= 0;

        try{
            doc.calc(x);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
