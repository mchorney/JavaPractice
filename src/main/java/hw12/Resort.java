package hw12;

import java.util.Arrays;

public class Resort {
    private String resort_name;
    private County county;
    private Beaches beach;
    private Amenities[] amenities;

    public Resort(String resort_name, County county, Beaches beach, Amenities[] amenities) {
        this.resort_name = resort_name;
        this.county = county;
        this.beach = beach;
        this.amenities = amenities;
    }

    public String getResort_name() {
        return resort_name;
    }

    public County getCounty() {
        return county;
    }

    public Beaches getBeach() {
        return beach;
    }

    public Amenities[] getAmenities() {
        return amenities;
    }


    public String toString () {
        return "Resort{" +
                "resort_name='" + resort_name + '\'' +
                ", county=" + county +
                ", beach=" + beach +
                ", amenities=" + Arrays.toString(amenities) +
                '}';
    }
}
