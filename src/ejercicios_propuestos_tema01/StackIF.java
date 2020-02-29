package ejercicios_propuestos_tema01;

public interface StackIF<E> extends SequenceIF<E>{
    /**
     * @pre !isEmpty()
     * @return la cima de la pila
     */
    public E getTop();

    /**
     * @param elemento elemento que se quiere añadir en la cima de la pila.
     */
    public void push(E elemento);

    /**
     * Elimina el elemento de la cima de la pila.
     * @pre !isEmpty()
     */
    public void pop();
}
