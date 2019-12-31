package capitulo_06;

/**
 * Interfaz Collection; la raiz de todas las colecciones 1.5.
 * @param <T>
 */
public interface Collection<T> extends Iterable<T>, java.io.Serializable {
    /**
     * Devuelve el numero de elementos de esta coleccion.
     */
    int size();

    /**
     * Comprueba si esta coleccion esta vacia.
     */
    boolean isEmpty();

    /**
     * Comprueba si un cierto elemento se encuentra en la coleccion.
     */
    boolean contains(Object x);

    /**
     * Añade un elemento a esta coleccion.
     */
    boolean add(T x);

    /**
     * Elimina un elemento de esta coleccion.
     */
    boolean remove(Object x);

    /**
     * Cambia el tamaño de esta coleccion, que pasa a ser cero.
     */
    void clear();

    /**
     * Obtiene un objeto Iterador utilizado para recorrer la coleccion.
     */
    Iterator<T> iterator();

    /**
     * Obtiene una vista de la coleccion en forma de matriz primitiva.
     */
    Object[] toArray();

    /**
     * Obtiene un vista de la coleccion en forma de matriz primitiva.
     */
    <T> T[] toArray(T[] arr);


}
