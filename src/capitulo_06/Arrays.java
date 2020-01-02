package capitulo_06;

import capitulo_04.Comparator;

/**
 * Clase sin instancias que contiene metodos estaticos para manipular matrices.
 */
public class Arrays {

    private Arrays(){}

    /**
     * Buscar en la matriz ordenada arr utilizando el comparador predeterminado.
     */
    public static <T extends Comparable<T>> int binarySearch(T[] arr, T x){
        return binarySearch(arr, x, new Collections.DefaultComparator<T>());
    }

    /**
     * Realiza una busqueda en la matriz ordenada arr usando un comparador.
     * Si arr no esta ordenada, los resultados no estan definidos.
     * @param arr la matriz en la que hay que buscar.
     * @param x el objeto que hay que buscar.
     * @return si se encuentra x, devuelve el indice en el que se ha encontrado.
     * En caso contrario, el valor de retorno es un numero negativo igual a -(p+1), donde p es la primera posicion
     * mayor que x. Este valor puede ir desde -1 hasta -(arr.length+1).
     * @throws ClassCastException si los elementos no son comparables.
     */
    public static <T> int binarySearch(T[] arr, T x, Comparator<? super T> cmp){

        int low = 0, mid = 0;
        int high = arr.length;

        while(low < high){
            mid = (low+high)/2;
            if(cmp.compare(x, arr[mid])>0) low = mid+1;
            else high = mid;
        }

        if(low == arr.length || cmp.compare(x, arr[low])!=0) return -(low+1);

        return low;
    }

}
