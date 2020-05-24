package L8;

import java.util.Arrays;

public class APP8part2 {
    public static void main(String[] args) {
        String str="Hello, students!";
        int len= str.length();

//        char c=str.charAt(1);
//        System.out.println(c);
//
//        String str1=str.concat(" Today is a rainy day :)");
//        System.out.println(str1);
//
//        str1 = str.replace('e','E');
//        System.out.println(str1);
//
//        int index = str.indexOf('e');
//        System.out.println(index);
//
//        boolean cont = str.contains("elo");
//        System.out.println(cont);
//
//        String ss="Hello, My name is Irina and i am 27 years old!";
//        String[] ss_array=ss.split(" ");
//        ss_array[4]="Katya";
//        ss_array[8]="98";
//        var sss= Arrays.asList(ss_array);
//        String str1 = String.join(" ", sss);
//        System.out.println(str1);
//
//        if("sss".equals("sss")){
//            System.out.println("good");
//        }
//
//        int res=str1.compareTo(str);
//        System.out.println(res);
//
//        str1 = str.indent(5);
//        System.out.println(str1);
//
//        String str2=str1.trim();
//        System.out.println(str2);

//        var cont= str.endsWith("ents!");
//        System.out.println(cont);
//
//        String str1 = str.substring(5);
//        System.out.println(str1);

        String str1 = str.substring(1,7);
        System.out.println(str1);

        var str2=str.subSequence(1,7);
        System.out.println(str2);
    }

}
