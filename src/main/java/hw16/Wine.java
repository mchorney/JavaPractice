package hw16;

import hw12_Enums.KindOf;

public class Wine {
    private TypeOfWine typeOfWine;
    private KindOfWine kindOfWine;
    private String name;
    private String country;
    private int year;

    public Wine(TypeOfWine typeOfWine, KindOfWine kindOfWine, String typeOfKind, String region, int year) {
        this.typeOfWine = typeOfWine;
        this.kindOfWine = kindOfWine;
        this.name = typeOfKind;
        this.country = region;
        this.year = year;
    }


    public TypeOfWine getTypeOfWine() {
        return typeOfWine;
    }

    public void setTypeOfWine(TypeOfWine typeOfWine) {
        this.typeOfWine = typeOfWine;
    }

    public KindOfWine getKindOfWine() {
        return kindOfWine;
    }

    public void setKindOfWine(KindOfWine kindOfWine) {
        this.kindOfWine = kindOfWine;
    }

    public String getName() {
        return name;
    }

    public void setName(String typeOfKind) {
        this.name = typeOfKind;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String region) {
        this.country = region;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "typeOfWine=" + typeOfWine +
                ", kindOfWine=" + kindOfWine +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}
