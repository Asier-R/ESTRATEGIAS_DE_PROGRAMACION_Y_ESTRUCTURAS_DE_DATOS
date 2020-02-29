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
     * @pre size()>1, puesto que si no, sería la cabeza
     * @return una sublista de la lista principal
     */
    public ListHTIF<E> getTail();

    /**
     * @pre !isEmpty()
     * @param element el nuevo valor con el que se modificara la cabeza de la lista.
     * @return el elemento de la cabeza modificado.
     */
    public E setHead(E element);

    /**
     * @post size()+1
     * @param element el nuevo elemento a introducir en la lista.
     * @return el elemento que se acaba de introducir.
     */
    public E insertHead(E element);

    /**
     * Elimina el primer elemento de la lista (head).
     * @return el elemento eliminado.
     */
    public E removeHead();

}
