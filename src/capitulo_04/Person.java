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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
