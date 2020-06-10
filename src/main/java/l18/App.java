package l18;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> xx = new ArrayList<>();
        xx.add("Hi");
//        xx.get(5);
//        int zz = 5/0;
        Doctor doc = new Doctor();
        int x=2;
        int y = 0;

//        doc.calculate(x);

//        try{
//            doc.calculate(x);
//        } catch (ArithmeticException ex){
//            System.out.println(ex);
//        }
//
//        try{
//            xx.get(5);
//        } catch (IndexOutOfBoundsException ex){
//            System.out.println(ex);
//        }

        try{
            doc.calculate(x);
            xx.get(y);
            throw new MyCustomException();
        } catch (ArithmeticException e){
            System.out.println("I'm here");
//            throw e;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("And I'm here too");
        } catch (Exception e) {
            System.out.println("I will catch ANY error");
        }
        finally {
            System.out.println("I will run in ANY case");
        }

        System.out.println("Program finished successfully");
    }
}
