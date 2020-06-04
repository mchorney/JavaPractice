package hwLesson14;

public final class Brabus extends Mercedes{
    private String extraPower; //POWERXTRA B40-700
    private String exhausedSystem; //SPORT EXHAUST SYSTEM

    public Brabus(){}

    public Brabus(String soundSystem, String engine, int horsePower, String extraPower, String exhausedSystem) {
        super(soundSystem, engine, horsePower);
        this.extraPower = extraPower;
        this.exhausedSystem = exhausedSystem;
    }

    public String getExtraPower() {
        return extraPower;
    }

    public void setExtraPower(String extraPower) {
        this.extraPower = extraPower;
    }

    public String getExhausedSystem() {
        return exhausedSystem;
    }

    public void setExhausedSystem(String exhausedSystem) {
        this.exhausedSystem = exhausedSystem;
    }
    public void sameName(){
        System.out.println("THIS IS FUNCTION FROM Child CLASS ");
    }

    public void brabusInfo() {
        System.out.println("Brabus{" +"soundSystem='" + soundSystem + '\'' +", engine='" + engine + '\'' +", horsePower=" + horsePower +
                "extraPower='" + extraPower + '\'' +
                ", exhausedSystem='" + exhausedSystem + '\'' +
                ", soundSystem='" + soundSystem + '\'' +
                ", engine='" + engine + '\'' +
                ", horsePower=" + horsePower +
                '}');
    }
}
