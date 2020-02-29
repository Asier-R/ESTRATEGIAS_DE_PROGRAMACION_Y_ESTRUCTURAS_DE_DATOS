package ejercicios_propuestos_tema01;

public interface ListMSIF<E> extends SequenceMS<E>{
    /**
     * @pre 0 < size() && 1<= pos <= size()
     * @param pos posicion en la lista del elemento que se quiere recuperar, comenzando en 1.
     * @return E elemento contenido en la posicion pos de la lista.
     */
    public E get(int pos);

    /**
     * Establece a element el valor de la posicion pos de la lista.
     * @pre 0 < size() && 1 <= pos <= size()
     * @param pos posicion en la lista del elemento cuyo valor se quiere modificar
     * @param element el elemento que se quiere introducir en la posicion pos de la lista
     */
    public void set(int pos, E element);

    /**
     * Inserta un nuevo elemento en la posicion pos.
     * @pre 1 <= pos <= size() && pos <= getMaxSize()
     * @param pos posicion de la lista donde se quiere insertar el nuevo elemento.
     * @param element el elemento a insertar en la posicion pos de la lista.
     */
    public void insert(int pos, E element);

    /**
     * Elimina un elemento de de la lista.
     * @pre 0 < size() && 1 <= pos <= size()
     * @param pos posicion en la lista del elemento a eliminar, comenzando en 1.
     */
    public void remove(int pos);
}
