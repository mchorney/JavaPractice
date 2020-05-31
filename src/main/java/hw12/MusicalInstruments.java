package hw12;

public class MusicalInstruments {
    private String name;
    private InstrumentFamily family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public void setFamily(InstrumentFamily family) {
        this.family = family;
    }

    public MusicalInstruments(String name, InstrumentFamily family) {
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return "MusicalInstruments {" +
                "Name = '" + name + '\'' +
                ", Family = " + family +
                '}';
    }
}
