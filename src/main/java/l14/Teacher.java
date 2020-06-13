package l14;

public class Teacher extends Person{
    private University[] universities;
    private Subject subject;

    public Teacher(String name, String lastName, int year, University[] universities, Subject subject) {
        super(name,lastName,year);
        this.universities = universities;
        this.subject = subject;
    }

    public University[] getUniversities() {
        return universities;
    }

    public void setUniversities(University[] universities) {
        this.universities = universities;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
