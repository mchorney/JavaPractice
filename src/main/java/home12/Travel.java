package home12;

public class Travel {
    private State where;
    private String withWhom;
    private Transport onWhat;

   public Travel(){
   }

    public State getWhere() {
        return where;
    }

    public void setWhere(State where) {
        this.where = where;
    }

    public String getWithWhom() {
        return withWhom;
    }

    public void setWithWhom(String withWhom) {
        this.withWhom = withWhom;
    }

    public Transport getOnWhat() {
        return onWhat;
    }

    public void setOnWhat(Transport onWhat) {
        this.onWhat = onWhat;
    }

    public Travel(State where,String withWhom,Transport onWhat){
       this.where=where;
       this.withWhom=withWhom;
       this.onWhat=onWhat;

    }

    @Override
    public String toString() {
        return "Travel{" +
                "where=" + where +
                ", withWhom='" + withWhom + '\'' +
                ", onWhat=" + onWhat +
                '}';
    }
}
