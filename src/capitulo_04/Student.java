package capitulo_04;

public class Student extends Person{

    private int gpa;

    public Student(String name, int age, int gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public String toString(){
        return "Name: "+getName()+"  Age: "+getAge()+"  Gpa: "+getGpa();
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
