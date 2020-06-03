package l14;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Bob", "Vance", new String[]{"Bourgeois", "Aristocrat"});
        person.Info();

        Student student = new Student("Ryan", "Howard",
                new String[]{"Effective Business Writing", "Entrepreneurship in Emerging Economies", "Global Business in Practice", "Machine Learning for Data Science and Analytics"},
                new int[]{95, 92, 99, 85}, 3);
        student.Info();

        Teachers professor = new Teachers("Michael", "Scott", new String[]{"Street science", "Sales", "Useless knowledge"}, "Doctor of Philosophy", 12);
        professor.Info();

    }
}
