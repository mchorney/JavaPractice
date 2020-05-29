package l11;

public class Bio {

    private String firstName;
    private String lastName;
    private String occupation;
    private String marriageStatus;
    private String[] fullInfo;

    public Bio() {
        System.out.println("Default constructor created");
        System.out.println();
    }

    public Bio(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
    public Bio(String fn, String ln, String occ) {
        setFirstName(fn);
        setLastName(ln);
        setOccupation(occ);
    }
    public Bio(String fn, String ln, String occ, String ms) {
        setFirstName(fn);
        setLastName(ln);
        setOccupation(occ);
        setMarriageStatus(ms);
    }

    public Bio(String[] one) {
        setFirstName(one[0]);
        setLastName(one[1]);
        setOccupation(one[2]);
        setMarriageStatus(one[3]);
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
