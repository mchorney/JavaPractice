package hw11_Getter_Setter;

public class Worker {
    private int id;
    private String[] departments;
    private double rate;
    private boolean isBusyStatus;
    
    public Worker() {}
    public Worker(int id, String[] departments, double rate) {
        this.id = id;
        this.departments = departments;
        this.rate = rate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }
    public String[] getDepartments() {
        return departments;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }

    public void setBusyStatus(boolean busyStatus) {
        isBusyStatus = busyStatus;
    }
    public boolean getBusyStatus() {
        return isBusyStatus;
    }
    
    

    public void printClass(Worker w) {
        System.out.println("Worker id# " + w.getId() + " from " + w.printArrays(w) + " departments ready to work for " + rate + " $/h.");
    }
    public String printArrays(Worker w) {
        String s = new String();
        for (String work : w.getDepartments()) {
            s += work + " ";
        }
        return s;
    }
}
