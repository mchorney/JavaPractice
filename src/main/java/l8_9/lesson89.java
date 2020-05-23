package l8_9;

public class lesson89 {
    public static void main(String[] args) {

        var xx = sum_of_5_numbers(5,55,14,-69,87);


        System.out.println(xx);

        String newWorld = sum_of_two_Strings("One", "Two");
        System.out.println(newWorld);
        System.out.println(sum_of_two_Strings("Three", "Four"));

    }

    public static int sum_of_5_numbers(int a1,int a2, int a3, int a4, int a5){
        return a1+a2+a3+a4+a5;

    }

    public static String sum_of_two_Strings(String str1, String str2){
        return str1+str2;
    }


}
