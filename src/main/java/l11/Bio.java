package l11;

public class Bio {

    private String firstName;
    private String lastName;
    private String occupation;
    private String marriageStatus;
    private String[] fullInfo;

    public Bio() {
        System.out.println("Default constructor created");
    }

    public Bio(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
        System.out.println("First name and last name added");
    }
    public Bio(String fn, String ln, String occ) {
        setFirstName(fn);
        setLastName(ln);
        setOccupation(occ);
        System.out.println("First name, last name and occupation added");
    }
    public Bio(String fn, String ln, String occ, String ms) {
        setFirstName(fn);
        setLastName(ln);
        setOccupation(occ);
        setMarriageStatus(ms);
        System.out.println("First name, last name, occupation and marriage status added");
    }

    public Bio(String[] one) {
        setFirstName(one[0]);
        setLastName(one[1]);
        setOccupation(one[2]);
        setMarriageStatus(one[3]);
        System.out.println("First name, last name, occupation and marriage status added as array");
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fo) {
        firstName = fo;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String fo) {
        lastName = fo;
    }

    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String fo) {
        occupation = fo;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }
    public void setMarriageStatus(String fo) {
        marriageStatus = fo;
    }

    public void setFullInfo(String[] fi) {
        this.fullInfo = fi;
    }

    public String[] getFullInfo() {
        return fullInfo;
    }

    public void printClass() {
        if (getFirstName() != null) System.out.println("First name: " + getFirstName());
        if (getLastName() != null) System.out.println("Last name: " + getLastName());
        if (getOccupation() != null) System.out.println("Occupation: " + getOccupation());
        if (getMarriageStatus() != null) System.out.println("Marriage status: " + getMarriageStatus());
        System.out.println();
    }
}
