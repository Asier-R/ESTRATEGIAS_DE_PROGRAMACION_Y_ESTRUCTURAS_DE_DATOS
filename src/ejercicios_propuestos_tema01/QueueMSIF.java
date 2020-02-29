package ejercicios_propuestos_tema01;

public interface QueueMSIF<E> extends SequenceMS<E>{
    /**
     * @pre !isEmpty()
     * @return la cabeza de la cola (primer elemento).
     */
    public E getFirst();

    /**
     * @pre size() < getMaxSize()
     * @param elemento elemento a introducir en la cola (al final).
     */
    public void enqueue(E elemento);

    /**
     * Quita el primer elemento de la cola.
     * @pre: !isEmpty()
     */
    public void dequeue();
}
