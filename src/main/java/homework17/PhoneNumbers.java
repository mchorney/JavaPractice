package homework17;

public class PhoneNumbers {
    private String name;
    private long phoneNumber;

    public PhoneNumbers(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void phone(){
        System.out.println(name+" - "+phoneNumber);
    }
}
