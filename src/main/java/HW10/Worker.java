package HW10;

public class Worker {
    public int id;
    public String department;
    public boolean isBusyStatus;

    public void readyToWork() {
        System.out.println("Is worker id# " + id + " from " + department + " department ready to work?");
    }
    public void startWork(Worker b) {
        if (b.isBusyStatus) {
            System.out.println("Worker id# " + id + " from " + department + " department is ready.");
        } else
            System.out.println("Worker id#" + id + " from " + department + " department is busy and can't start new work.");
    }
}
