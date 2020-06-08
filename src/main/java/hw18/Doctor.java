package hw18;

public class Doctor {
    private String name;
    private String lastname;
    private Position position;

    public Doctor(String name, String lastNae, Position position) {
        this.name = name;
        this.lastname = lastNae;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
//
//    @Override
//    public String toString() {
//        return "Doctor{" +
//                "name='" + name + '\'' +
//                ", lastNae='" + lastNae + '\'' +
//                ", position=" + position +
//                '}';
//    }
//
//        public void printDoc() {
//        System.out.println( "Doctor{" +
//                "name='" + name + '\'' +
//                ", lastNae='" + lastNae + '\'' +
//                ", position=" + position +
//                '}');
//    }
//

    void getDoctor(){
        System.out.println(name+" "+lastname+" "+position);

    }


}

