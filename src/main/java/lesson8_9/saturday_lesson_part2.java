package lesson8_9;

import java.util.Arrays;

public class saturday_lesson_part2 {
    public static void main(String[] args) {
        String str="Hello, students";
//        System.out.println(str.length());
//
//        System.out.println(str.charAt(0));
//
//        System.out.println(str.concat(" today is a rainy day!"));
//
//        System.out.println(str.replace('e','E'));
//
//        System.out.println(str.indexOf('e'));
//
//        System.out.println(str.contains("ello"));
//
//        System.out.println(str.toUpperCase());
//
//        System.out.println(str.toLowerCase());

        String ss="today is a rainy day,and I can't see a blue sky";
        String[]ss_array=ss.split(" ");
        //System.out.println(ss_array[3]);
        ss_array[3]="sunny";
        ss_array[7]="can";
        var sss= Arrays.asList(ss_array);
        String str1=String.join(" ",sss);
        System.out.println(str1.toUpperCase());
        if("sss".equals("sss")) System.out.println("good");

//        int res=str.compareTo(str1);
//        System.out.println(res);

        //System.out.println(str1.compareTo(str));
        System.out.println(str.indent(10));
        System.out.println(str.trim());
        System.out.println(str.endsWith("ents"));
        //System.out.println(str.substring(2,8));
        System.out.println(str.subSequence(2,5));
        System.out.println(str.toCharArray());


    }
}
