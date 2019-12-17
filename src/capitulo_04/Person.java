package capitulo_04;

public class Person {

    private int age;

    private String name;

    public Person (String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Name: "+getName()+"  Age: "+getAge();
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int getAge() {
        return age;
    }

    public final String getName() {
        return name;
    }
}
