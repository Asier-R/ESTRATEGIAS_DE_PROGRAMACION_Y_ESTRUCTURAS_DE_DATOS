package capitulo_04;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Abundio", 33);
        Student s = new Student("Adolf", 88,66);

        Person x = new Student("X",99,0);
        System.out.println(x.toString());
        // x no tiene acceso a los metodos propios de Student
        // x.getGpa(33); --> ERROR
        Student newX = (Student)x;
        // haciendo el casting a student si que se puede acceder a los metodos de student
        newX.setGpa(22);
        System.out.println(newX.toString());

        BigInteger[] marra = {new BigInteger("12"),new BigInteger("29"),new BigInteger("212"),new BigInteger("22")};
        System.out.println("Max Number: "+findMax(marra));

        String[] barra = {"Asier", "Ander", "Izaskun", "Guillermo", "Leire"};
        System.out.println("Max String: "+findMax(barra));

        Person juan = new Person("Juan", 33);
        Person ana = new Person("Ana",44);
        Person marcos = new Person("Marcos",54);

        Person[] arrP = {juan,ana,marcos};
        System.out.println();
        System.out.println("Juan id: "+juan.getId());
        System.out.println("Ana id: "+ana.getId());
        System.out.println("Marcos id: "+marcos.getId());
        System.out.println("Max id: "+findMax(arrP));
        System.out.println();

    }

    /*
    // METODO PARA ENCONTRAR EL MAXIMO DE UN BIGINTEGER
    public static BigInteger findMax(BigInteger [] arr){

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++)
            if(arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        return arr[maxIndex];
    }

    // METODO PARA ENCONTRAR EL MAXIMO DE UN STRING
    public static String findMax(String [] arr){

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++)
            if(arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        return arr[maxIndex];
    }
    */

    // METODO PAR ENCONTRAR EL MAXIMO DE UN OBJETO
    // SOLO VALIDO PARA CLASES QUE IMPLEMENTAN LA INTERFAZ COMPARABLE
    public static Comparable findMax(Comparable [] arr){

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++)
            if(arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        return arr[maxIndex];
    }
}
