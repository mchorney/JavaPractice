package hw11;

public class Job {
    private String [] employees;
    private  String name;

    public Job(String[] employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public Job() {
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
    public void printOut(){
        System.out.println("Name ="+name);
        for(String employee:this.employees){
            System.out.println(employee);
        }
    }

}
