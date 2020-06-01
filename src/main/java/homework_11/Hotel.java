package homework_11;

public class Hotel {
    private String name;
    private String country;
    private String[] room_category;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String[] getRoom_category() {
        return room_category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRoom_category(String[] room_category) {
        this.room_category = room_category;
    }

    public Hotel(String name, String country, String[] room_category) {
        this.name = name;
        this.country = country;
        this.room_category = room_category;
    }
    public Hotel(){}

    public void printOut() {
        System.out.println(name + "\n" + country);
        String[] array = room_category;
        for (String v : array) {
            System.out.println(v);
        }
    }
}
