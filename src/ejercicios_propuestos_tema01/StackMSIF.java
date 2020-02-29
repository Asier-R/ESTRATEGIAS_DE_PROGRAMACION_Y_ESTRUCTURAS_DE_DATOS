package ejercicios_propuestos_tema01;

public interface StackMSIF<E> extends SequenceMS<E>{
    /**
     * @pre !isEmpty()
     * @return la cima de la pila
     */
    public E getTop();

    /**
     * @pre size() < getMaxSize()
     * @param elemento elemento que se quiere añadir en la cima de la pila.
     */
    public void push(E elemento);

    /**
     * Elimina el elemento de la cima de la pila.
     * @pre !isEmpty()
     */
    public void pop();
}
