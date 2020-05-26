package l8_9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        String str = "Hello, students";
        int len = str.length();
        System.out.println(len);

        char c = str.charAt(14);
        System.out.println(c);

        String str1 = str.concat(" today is a rainy day");
        System.out.println(str1);

        str1 = str.replace('e', 'E');
        System.out.println(str1);

        int index = str.indexOf('e');
        System.out.println(index);

        boolean cont = str.contains("ello");
        System.out.println(cont);

        str1 = str.toUpperCase();
        System.out.println(str1);

        str1 = str.toLowerCase();
        System.out.println(str1);

        String ss = "today,is,a,sunny,day,and,I,can,see,a,blue,sky";
        String[] ss_array = ss.split(",");
        ss_array[3] = "sunny";
        ss_array[7] = "can";
        List<String> sss = Arrays.asList(ss_array);
        str1 = String.join(" ", sss);
        System.out.println(str1);

        System.out.println(str.equals(str1));

        int res = str1.compareTo(str);
        System.out.println(res);

//        str1 = str.indent(5);
//        System.out.println(str1);

        String str2 = str1.trim();
        System.out.println(str2);

        cont = str.endsWith("ents");
        System.out.println(cont);

        cont = str.startsWith("Hell");
        System.out.println(cont);

        str1 = str.substring(5);
        System.out.println(str1);

        str1 = str.substring(2, 8);
        System.out.println(str1);

        CharSequence dd = str.subSequence(2, 5);
        System.out.println(dd);

        char[] chars = str.toCharArray();
    }
}
