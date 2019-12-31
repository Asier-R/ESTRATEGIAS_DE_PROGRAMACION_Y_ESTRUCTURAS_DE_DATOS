package capitulo_06;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1, 21, 42, 3, 5, 11, 89};

        MyContainer con1 = new MyContainer(array);

        Iterator it = con1.iterator();

        while (it.hasNext()) {
            System.out.print("\t" + it.next());
        }
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
