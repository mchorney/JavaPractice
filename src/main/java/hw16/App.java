package hw16;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> flowers= new ArrayList<String>();
        flowers.add("rose");
        flowers.add("tulip");
        flowers.add("forgetmenot");
        flowers.add("marygold");

        List<Integer> superBall= new ArrayList<Integer>();
        superBall.add(56);
        superBall.add(45);
        superBall.add(20);
        superBall.add(11);

        List<Weather> weatherList= new ArrayList<Weather>();
        Weather may= new Weather("Monday",01,true);
        weatherList.add(may);
        weatherList.add(new Weather("Tuesday",02,false));
        weatherList.add(new Weather("Wednesday",03,false));
        weatherList.add(new Weather("Thusday",04,true));

        System.out.println(flowers);
        System.out.println(superBall);

        for (String v: flowers){
            System.out.println(v);
        }

        for (int i=0; i<superBall.size(); i++){
            System.out.println(superBall.get(i));
        }

        weatherList.forEach(x -> System.out.println(x));
        List<Integer> dates= new ArrayList<Integer>();
        weatherList.forEach(x -> {
             dates.add(x.getDate());

        });
        System.out.println(dates);

        System.out.println(weatherList);

        weatherList.remove(2);
        System.out.println(weatherList);

        Weather tmp= weatherList.get(0);
        weatherList.set(0, weatherList.get(2));
        weatherList.set(2,tmp);
        System.out.println(weatherList);





    }
}

