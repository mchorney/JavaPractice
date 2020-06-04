package hwLesson14;

public class Amg extends Mercedes{
//    private String soundSystem;   //bose
//    private String  engine;   //2.0L inline-4 turbo
//    private int horsePower;  //221
    //super(soundSystem,engine,horsePower)
    //Special to AMG
    private String bodySyle; //AMG body styling
    private String boards;//AMG Illuminated running boards
    private Roof roof; //AMG Panorama roof

    public Amg(String soundSystem, String engine, int horsePower, String bodySyle, String boards, Roof roof) {
        super(soundSystem,engine,horsePower);
        this.bodySyle = bodySyle;
        this.boards = boards;
        this.roof = roof;
    }


    public String getBodySyle() {
        return bodySyle;
    }

    public void setBodySyle(String bodySyle) {
        this.bodySyle = bodySyle;
    }

    public String getBoards() {
        return boards;
    }

    public void setBoards(String boards) {
        this.boards = boards;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
    public void sameName(){
        System.out.println("THIS IS FUNCTION FROM CLASS Amg");
    }
    public void amgInfo() {
        System.out.println( "Amg{" +"soundSystem='" + soundSystem + '\'' +", engine='" + engine + '\'' +", horsePower=" + horsePower +
                "bodySyle='" + bodySyle + '\'' +
                ", boards='" + boards + '\'' +
                ", roof=" + roof +
                '}');
    }
}
