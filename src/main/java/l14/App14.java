package l14;

public class App14 {
    public static void main(String[] args) {
        Student peter = new Student("Peter", "Johnson", 1992,University.COLAMBUS, Subject.BIOLOGY);
        peter.myInfo();
        Teacher mrJackson = new Teacher("John","Jackson", 1965,new University[]{University.COLAMBUS},Subject.COMPUTER_SCIENCE);

    }
}
