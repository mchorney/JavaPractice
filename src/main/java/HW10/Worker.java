package HW10;

public class Work {
    public class Worker {
        int id;
        String department;
        boolean isBusyStatus;

        public void readyToWork() {
            System.out.println("Is worker " + id + department + " ready to work?");
        }
        public void startWork(boolean isBusy) {
            if (isBusy) {
                System.out.println("Worker " + id + department + " is ready.");
            }
            System.out.println("Worker " + id + department + " is busy and can't start new work.");
        }
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker();
        
    }


}
