package capitulo_04;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------");
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
        System.out.println("------------------------------------------------------------------------------------");

        // APARTADO (4.6) //
        System.out.println("------------------------------------------------------------------------------------");
        BigInteger[] marra = {new BigInteger("12"),new BigInteger("29"),new BigInteger("212"),new BigInteger("22")};
        System.out.println("Max Number: "+findMax(marra));

        String[] barra = {"Asier", "Ander", "Izaskun", "Guillermo", "Leire"};
        System.out.println("Max String: "+findMax(barra));

        Person juan = new Person("Juan", 33);
        Person ana = new Person("Ana",44);
        Person marcos = new Person("Marcos",54);
        Student pablo = new Student("Pablo",54,10);

        Person[] arrP = {juan,ana,marcos,pablo};
        System.out.println();
        System.out.println("Juan id: "+juan.getId());
        System.out.println("Ana id: "+ana.getId());
        System.out.println("Marcos id: "+marcos.getId());
        System.out.println("Pablo id: "+pablo.getId());
        System.out.println("Max id: "+findMax(arrP));
        System.out.println("------------------------------------------------------------------------------------");


        // Apartado (4.7.6) //
        System.out.println("------------------------------------------------------------------------------------");
        GenericSimpleArrayList<Person> listaPersonas = new GenericSimpleArrayList<>();
        listaPersonas.add(juan);
        listaPersonas.add(ana);
        listaPersonas.add(marcos);
        listaPersonas.add(pablo);

        for(int i=0; i<listaPersonas.size(); i++){
            System.out.println("Persona num: "+i+"    Datos:\n"+listaPersonas.get(i).toString()+"\n");
        }
        System.out.println("------------------------------------------------------------------------------------");


        // Apartado (4.8) //
        System.out.println("------------------------------------------------------------------------------------");
        Student juantxo = new Student("Juantxo", 33,5);
        Student anatxu = new Student("Anatxu",44,5);
        Student markos = new Student("Markos",54,5);
        Student pabloa = new Student("Pabloa",54,10);
        Student[] arrS = {juantxo,anatxu,markos,pabloa};
        System.out.println();
        System.out.println("Juantxo id: "+juantxo.getId());
        System.out.println("Anatxu id: "+anatxu.getId());
        System.out.println("Markos id: "+markos.getId());
        System.out.println("Pabloa id: "+pabloa.getId());
        System.out.println("FindMaxFUNCTOR: "+findMaxFunctor(arrS, new objetoFunctor()));
        // Solo se crea el objetoFunctor para poder usar su funcion compare ---> Functor
        System.out.println("------------------------------------------------------------------------------------");


    }

    /*
    // METODO PARA ENCONTRAR EL MAXIMO DE UN BIGINTEGER  (4.6)
    public static BigInteger findMax(BigInteger [] arr){

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++)
            if(arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        return arr[maxIndex];
    }

    // METODO PARA ENCONTRAR EL MAXIMO DE UN STRING  (4.6)
    public static String findMax(String [] arr){

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++)
            if(arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        return arr[maxIndex];
    }
    */

    // METODO PAR ENCONTRAR EL MAXIMO DE UN OBJETO
    // SOLO VALIDO PARA CLASES QUE IMPLEMENTAN LA INTERFAZ COMPARABLE  (4.6)
    /*
    public static Comparable findMax(Comparable [] arr){

        int maxIndex = 0;

        for(int i=1; i<arr.length; i++)
            if(arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        return arr[maxIndex];
    }
    */

    // APARTADO (4.7.4) //
    public static <T extends Comparable<? super T>> T findMax(T [] a){
        int maxIndex = 0;

        for(int i=1; i<a.length; i++)
            if(a[i].compareTo( a[maxIndex]) > 0)
                maxIndex = i;

        return a[maxIndex];
    }

    // APARTADO (4.8) //
    // Se crea una interfaz llamada "Comparator" para que los objetos que las crean implementen la funcion "compare"
    // De esta forma el metodo "findMaxFunctor" puede recibir dicho objeto y llamar a la funcion "compare"
    // compare(T lhs, T rhs) recibe los dos elementos a comparar. En esta funcion uno es el elemento del array
    // señalado por el indice, y el otro es el ultimo elemento mas grande. Este elemento se actualiza en cada iteracion
    // hasta terminar el for, devolviendo el ultimo elemento almacenado (el mas grande).
    public static <T> T findMaxFunctor(T [] a, Comparator<? super T> cmp){
        int maxIndex = 0;

        for(int i=1; i<a.length; i++)
            if(cmp.compare(a[i], a[maxIndex]) > 0)
                maxIndex = i;

        return a[maxIndex];
    }
}
