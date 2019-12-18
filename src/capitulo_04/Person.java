package capitulo_04;

import java.util.Random;

public class Person implements Comparable{

    private int age;
    private String name;
    private int id = 0;

    public Person (String name, int age){
        this.age = age;
        this.name = name;
        this.id = (int)(Math.round(Math.random()*1000)+1);
    }

    public String toString(){
        return "Name: "+getName()+"  Age: "+getAge()+"  id: "+getId();
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

    public final int getId(){
        return id;
    }

    @Override
    public int compareTo(Object person) {
        Person p = (Person)person;
        if(this.id < p.getId()){
            return -1;
        }else if(this.getId() == p.getId()){
            return 0;
        }else{
            return 1;
        }
    }
}
