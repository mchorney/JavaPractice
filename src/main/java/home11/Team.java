package home11;

public class Team {
    private String name;
    private String lastname;
    private int teamNumber;
    private String gender;

    public Team() {
    }

    public Team(String name, String lastname, int teamNumber, String gender) {
        this.name = name;
        this.lastname = lastname;
        this.teamNumber = teamNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public String getgender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setlastname(String lastname){
        this.lastname=lastname;
    }
    public void setteamNumber(int teamNumber){
        this.teamNumber=teamNumber;
    }
    public void setgender(String gender){
        this.gender=gender;
    }

    public void printClass(){
        System.out.println("Hello, I'm a football player my name " + name+" my lastname is "+lastname+" my teamenumber is "+teamNumber);
    }
}
