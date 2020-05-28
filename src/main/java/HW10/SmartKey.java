package HW10;

public class SmartKey {
    String firstName;
    String lastName;
    boolean membershipStatus;

    boolean areYouMember(SmartKey a) {
        return a.membershipStatus;
    }
    void welcome(SmartKey a) {
        if (a.areYouMember(a)) {
            System.out.println(firstName + " " + lastName + " you are welcome!");
        }else
            System.out.println("Sorry! " + firstName  + " " + lastName +  " Access is denied");
    }
}
