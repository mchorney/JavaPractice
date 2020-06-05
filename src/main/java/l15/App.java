package l15;

public class App {
    public static void main(String[] args) {
        Person student1 = new Student("Bob Vense", new int[]{5, 6, 7, 8}, new String[]{"Math", "Biology", "Chemistry", "Physics"});
        System.out.println("Average score is " + student1.averageScore());
        student1.info();

        Person student2 = new Student("Robert Scott", new int[]{98, 95, 98, 98, 58, 58, 69, 66}, new String[]{"Math", "Biology", "Chemistry", "Physics","Astronomy","History"});
        System.out.println("Score is " + student2.averageScore());
        student2.info();

        Person teacher1 = new Teacher("Bill Gates", "Undergraduate", 58, 66 );
        teacher1.info();
        System.out.println(teacher1.averageScore() + " students don't pass this class.");

        Person teacher2 = new Teacher("Arthur Danto", "Professor", 3, 250);
        teacher2.info();
        System.out.println(teacher2.averageScore() + " students don't pass this class.");
    }
}
