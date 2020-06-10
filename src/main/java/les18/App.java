package les18;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String>xx = new ArrayList<>();
        xx.add("Hello");
//        try{
//            xx.get(5);
//        } catch(Exception ex){
//            System.out.println(ex);
//        }
//        xx.get(5);
//        ArrayList<String> zz = ;
//        zz.add("Hello");
//        int zz = 5/0;
        Doctor doc = new Doctor();
        int x = 2;
        int y = 0;
       //doc.calculate(x);
//        try{
//            doc.calculate(x);
//        } catch(Exception ex){
//            System.out.println(ex);
//        }

        try {
            doc.calculate(x);
            xx.get(y);
            throw new MyCustomException();
        } catch (ArithmeticException e){
            System.out.println("I'm here");
            throw e;
        }catch (IndexOutOfBoundsException b){
            System.out.println("And I'm here");
        } catch (Exception e){
            System.out.println("I will catch any exception");
        }
        finally{
            System.out.println("I will run in ANY case");
        }

        System.out.println("Program finished sucessfully");


    }
}
