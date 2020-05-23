package I8_9;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class part_2_1 {
    public static void main(String[] args) {
        String str = "Hello, students";
        int len = str.length();
        System.out.println(str.length());

        char c = str.charAt(14);
        System.out.println(c);

        String str1 = str.concat("today is a rainy day");
        System.out.println(str1);

        str1 = str.replace(oldChar:'e', newChar:'E');
        System.out.println(str1);

        int index = str.indexof('e');
        System.out.println(index);

        boolean cont = str.contains("ello");
        System.out.println(cont);

        str1 = str.toUpperCase();
        System.out.println(str1);

        str1 = str.toLowerCase();
        System.out.println(str1);

        String ss = "today a rainy day and I can't see a blue sky";
        String [] ss_array = ss.split(regex: " ");
        ss_array[3] = "sunny";
        ss_array[7] = "can";
        var sss = Arrays.asList(ss_array);
        str1 = String.join(delimiter: " ", sss);
        System.out.println(ss_array[3]);

        System.out.println(str.equals(str1));

        int res = str.compareTo(str1);
        System.out.println(res);

        str1 = str.indent(5);
        System.out.println(str1);

        String str2 = str1.trim ();
        System.out.println(str2);

        cont = str.endsWith("ents");
        System.out.println(cont);

        cont = str.startsWith("Hello");
        System.out.println(cont);

        str1 = str.substring(5);
        System.out.println(str1);

        str1 = str.substring(2,8);
        System.out.println(str1);

        var dd = str.subSequence(2,5);
        System.out.println(dd);

        char[] chars = str.toCharArray();

        }

    }
}
