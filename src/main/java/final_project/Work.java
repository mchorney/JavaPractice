package final_project;

public class Work {
    public static void main(String[] args) {
        BlueWhale bw = new BlueWhale("Moby Dick",1655894.8);
        Lion leo = new Lion("White Lion");
        Wolf woof = new Wolf("Arctic wolf");

        System.out.println(bw.forPrint());
        bw.breath();
        bw.canMove();
        bw.fly();
        bw.eat();
        bw.haveSpine();
        bw.reproduction();
        bw.hunt();

        System.out.println("----------------\n"+leo.forPrint());
        leo.breath();
        leo.canMove();
        leo.eat();
        leo.haveSpine();
        leo.fly();
        leo.reproduction();
        leo.hunt();

        System.out.println("----------------\n"+ woof.forPrint());
        woof.breath();
        woof.canMove();
        woof.eat();
        woof.fly();
        woof.reproduction();
        woof.hunt();
        woof.haveSpine();

    }
}
