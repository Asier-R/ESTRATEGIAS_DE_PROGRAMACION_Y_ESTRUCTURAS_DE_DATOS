package capitulo_06;

import capitulo_04.Comparator;
import java.util.NoSuchElementException;

/**
 * Clase sin instancias que contiene metodos estaticos que operan sobre colecciones.
 */
public class Collections {

    /**
     * No instanciable.
     */
    private Collections(){
        // No instanciable
    }

    /**
     * Devuelve un comparador que impone el inverso de la ordenacion
     * predeterminada a una coleccion de objetos que implementa la interfaz Comparable.
     * @return el comparador.
     */
    public static <T> Comparator<T> reverseOrder(){
        return new ReverseComparator<T>();
    }

    private static class ReverseComparator<T> implements Comparator<T>{

        @Override
        public int compare(T lhs, T rhs) {
            return -((Comparable)lhs).compareTo(rhs);
        }
    }

    static class DefaultComparator<T extends Comparable<? super T>> implements Comparator<T>{

        @Override
        public int compare(T lhs, T rhs) {
            return lhs.compareTo(rhs);
        }
    }

    /**
     * Devuelve el objeto maximo de la coleccion, utilizando la ordenacion predeterminada.
     * @param coll la coleccion.
     * @return el objeto maximo.
     * @throws java.util.NoSuchElementException si coll esta vacia.
     * @throws ClassCastException si los objetos de la coleccion no pueden compararse.
     */
    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll){
        return max(coll, new DefaultComparator<T>());
    }

    /**
     * Devuelve el objeto maximo de la coleccion.
     * @param coll la coleccion.
     * @param cmp el comparador.
     * @return el objeto maximo.
     * @throws java.util.NoSuchElementException si coll esta vacia.
     * @throws ClassCastException si los objetos de la coleccion no pueden compararse.
     */
    public static <T> T max(Collection<? extends  T> coll, Comparator<? super T> cmp){
        if(coll.size()==0) throw new NoSuchElementException();

        Iterator<? extends T> itr = coll.iterator();

        T maxValue = itr.next();

        while(itr.hasNext()){
            T current = itr.next();
            if (cmp.compare(current, maxValue) > 0) maxValue = current;
        }

        return maxValue;
    }
}
