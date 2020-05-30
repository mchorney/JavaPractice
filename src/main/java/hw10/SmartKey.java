package hw10;

public class SmartKey {
    public String firstName;
    public String lastName;
    public boolean membershipStatus;

    public boolean areYouMember(SmartKey b) {
        return b.membershipStatus;
    }
    public void welcome(SmartKey a) {
        if (a.areYouMember(a)) {
            System.out.println(firstName + " " + lastName + " you are welcome!");
        }else
            System.out.println("Sorry! " + firstName  + " " + lastName +  " Access is denied");
    }
}
