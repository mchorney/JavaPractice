package hw15;

public class Work {
    public static void main(String[] args) {
        Pet musia = new Cat("Musia", 2);
        Pet pupa = new Cat("Pupa", 5);
        Pet rex = new Dog("Rex", 4);
        Pet gav = new Dog("Gav", 12);
        musia.sleep();
        musia.wakeUp();
        System.out.println(musia.hi());
        pupa.sleep();
        pupa.wakeUp();
        System.out.println(pupa.hi());
        //---------------------------------
        rex.sleep();
        rex.wakeUp();
        System.out.println(rex.hi());
        gav.sleep();
        gav.wakeUp();
        System.out.println(gav.hi());

    }
}
