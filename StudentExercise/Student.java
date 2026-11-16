public class Student implements Comparable<Student> {
    private int id;
    private String namee;
    private double gpa;


    public Student(double gpa, int id, String namee) {
        this.gpa = gpa;
        this.id = id;
        this.namee = namee;
    }
    public Student() {
        this.gpa = 0.0;
        this.id = 0;
        this.namee = "Unknown";
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String getNamee() {
        return namee;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public boolean isOnProbation() {
        return gpa < 2.0;
    }

    @Override
    public String toString(){
        return id+" "+namee+" "+gpa;
    }
    @Override
    public int compareTo(Student other) {
        int result = Double.compare(this.gpa, other.gpa);

        if (result == 0) {
            result = this.namee.compareTo(other.namee);
        }

        return result;
    }


}
