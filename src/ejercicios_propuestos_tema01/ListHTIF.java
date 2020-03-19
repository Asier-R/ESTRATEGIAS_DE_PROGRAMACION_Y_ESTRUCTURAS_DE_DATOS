package ejercicios_propuestos_tema01;

/**
 * Tema 1. Ejercicio 2.
 * Interfaz ListHTIF: Representa una lista de elementos de los cuales solo se tiene acceso al primero de ellos.
 * @param <E> el tipo de dato que contendra la lista.
 */
public interface ListHTIF<E> extends SequenceIF<E> {

    /**
     * @pre !isEmpty()
     * @return el primer elemento de la lista (head).
     */
    public E getHead();

    /** Devuelve el resto de elementos de la lista
     * @pre !isEmpty();
     * @return una sublista de la lista principal
     */
    public ListHTIF<E> getTail();

    /**
     * @pre !isEmpty()
     * @param element el nuevo valor con el que se modificara la cabeza de la lista.
     * @return la lista recien modificada.
     */
    public ListHTIF<E> setHead(E element);

    /**
     * @post new size() = old size()+1
     * @param element el nuevo elemento a introducir en la lista.
     * @return la nueva lista recien formada.
     */
    public ListHTIF<E> insertHead(E element);

    /**
     * Elimina el primer elemento de la lista (head).
     * @pre !isEmpty()
     * @post new size() = old size()-1
     * @return la nueva lista sin la cabeza anterior.
     */
    public ListHTIF<E> removeHead();

}
