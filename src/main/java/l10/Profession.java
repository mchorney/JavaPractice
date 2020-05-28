package l10;

public class Profession {

    public String job;
    public int hours;
    public int hourSalary;

    public void info() {
        System.out.println("You are working as " + job + ". You work " + hours + " per week and you get " + hourSalary + "$ for one hour.");
    }

    public void yearSalary() {
        int totalSalary = hours * hourSalary * 52;
        System.out.println("your year salary is " + totalSalary + "$.");
    }
}
