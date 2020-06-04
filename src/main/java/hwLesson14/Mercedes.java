package hwLesson14;

public class Mercedes {
    protected String soundSystem;   //bose
    protected String  engine;   //2.0L inline-4 turbo
    protected int horsePower;  //221

    public Mercedes(){}

    public Mercedes(String soundSystem, String engine, int horsePower) {
        this.soundSystem = soundSystem;
        this.engine = engine;
        this.horsePower = horsePower;
    }

    public String getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void sameName(){
        System.out.println("THIS IS FUNCTION FROM Parent Class");
    }
    @Override
    public String toString() {
        return "Mercedes{" +"soundSystem='" + soundSystem + '\'' +", engine='" + engine + '\'' +", horsePower=" + horsePower +'}';
    }

}
