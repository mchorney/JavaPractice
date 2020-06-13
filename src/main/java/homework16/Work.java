package homework16;

import java.util.ArrayList;

public class Work {
    public static void main(String[] args) {

//        add
        ArrayList<String> names = new ArrayList<>();
        names.add("Stany");
        names.add("Garry");
        names.add("Irina");
        System.out.println(names);
        ArrayList<Integer> salary = new ArrayList<>();
        salary.add(90000);
        salary.add(120000);
        salary.add(100000);
        System.out.println(salary);
        ArrayList<Hotels> htl= new ArrayList<>();
        htl.add(new Hotels("Marriot"));
        htl.add(new Hotels("Hilton"));
        htl.add(new Hotels("Ritz"));
        System.out.println(htl);
        // set
        names.set(1,"John");
        salary.set(0,110000);
        htl.set(1,new Hotels("Crown Plaza"));
        System.out.println(names);
        System.out.println(salary);
        System.out.println(htl);
//        remove
        names.remove("John");
        salary.remove("30000");
        htl.remove(1);
        System.out.println(names);
        System.out.println(salary);
        System.out.println(htl);

//        get
        System.out.println(names.get(0));
        System.out.println(htl.get(1));


//        foreach
        for (String v:names ) {
            System.out.println(v);
        }

    }
}
