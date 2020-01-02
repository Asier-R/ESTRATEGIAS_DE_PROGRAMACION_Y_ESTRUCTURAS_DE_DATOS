package capitulo_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1, 21, 42, 3, 5, 11, 89};

        MyContainer con1 = new MyContainer(array);

        Iterator it = con1.iterator();

        while (it.hasNext()) {
            System.out.print("\t" + it.next());
        }

        System.out.println("\n---------------------------------------------------------------------");

        Integer[] array2 = {1, 21, 42, 43, 55, 411, 589};
        ArrayList<Integer> col = new ArrayList<>(Arrays.asList(1, 21, 42, 43, 55, 411, 589));

        int posi = Arrays.binarySearch(array2,411);
        int posi2 = Collections.binarySearch(col,589);

        if(posi==-1) System.out.println("Menor que los del array");
        else if(posi<-1) System.out.println("Elemento mayor que los del array, ira justo despues del ultimo");
        else System.out.println("Elemento en la posicion "+posi);
        System.out.println("Posi: "+posi);
        System.out.println("---------------------------------------------------------------------");

        if(posi2==-1) System.out.println("Menor que los del array");
        else if(posi2<-1) System.out.println("Elemento mayor que los del array, ira justo despues del ultimo");
        else System.out.println("Elemento en la posicion "+posi2);
        System.out.println("Posi: "+posi2);
    }

    // Imprime el contenido de Collection c (usando el iterador de java.util directamente)
    // Para poder usar Iterador_2, habria que hacer casting --> Iterador_2<T> itr = (Iterador_2<T>) c.iterator();
    public static <T> void printCollection(Collection<T> c) {

        java.util.Iterator<T> itr = c.iterator();

        while(itr.hasNext()){
            System.out.println(itr.hasNext()+"");
        }
        System.out.println();
    }

    // Imprime el contenido de Collection c (usando el bucle for avanzado)
    public static <T> void printCollection2(Collection<T> c) {

        for (T e: c) {
            System.out.println(e + " ");
        }
        System.out.println();
    }
}
