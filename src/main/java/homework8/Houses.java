package homework8;

public class Houses {
    public int square;
    public int levels;
    public String realtor;
    public String neborhood;
    public String name;

    public void presenter(){
        System.out.println("Houses from neighborhood "+neborhood+" presenting by "+realtor);
    }
    public void homecards(){
        System.out.println("House "+ name+" has "+levels+" level/levels and "+square+" square feet size");
    }
}
