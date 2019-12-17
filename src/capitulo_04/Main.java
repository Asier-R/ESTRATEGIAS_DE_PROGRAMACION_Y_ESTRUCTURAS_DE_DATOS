package capitulo_04;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Abundio", 33);
        Student s = new Student("Adolf", 88,66);

        Person x = new Student("X",99,0);
        // x no tiene acceso a los metodos propios de Student
        Student newX = (Student)x;
        // haciendo el casting a student si que se puede acceder a los metodos de student
        newX.setGpa(22);
        System.out.println(newX.toString());


    }

}
