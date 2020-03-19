package ejercicios_propuestos_tema01;

/**
 * Tema 1. Ejercicio 1.
 * Interfaz ListIPIF: Representa una lista de elementos con punto de interés.
 */
public interface ListIPIF<E> extends SequenceIF<E> {

    /**
     * Devuelve la posicion que tiene el puntero en ese momento.
     * @post 1 <= valor devuelto <= size()+1
     * @return posicion del puntero.
     */
    public int getPointerPosition();

    /**
     * Establece la posicion del puntero.
     * @param pos posicion del puntero
     * @pre 1 <= pos <= size()+1
     * @post getPointerPosition()=pos
     */
    public void setPointerPosition(int pos);

    /**
     * Inserta un elemento en la posicion del puntero.
     * @param elemento elemento a insertar.
     * @pre 1 <= getPointerPosition() <= size()+1
     * @post new size() = pre size()+1
     */
    public void insert(E elemento);

    /**
     * Modifica el valor de la posicion del puntero.
     * @param elemento nuevo valor a introducir.
     * @pre 1 <= getPointerPosition() <= size()
     */
    public void set(E elemento);

    /**
     * @pre 1 <= getPointerPosition() <= size()
     * @return E el elemento en la posicion actual del puntero.
     */
    public E get();

    /**
     * Elimina el elemento situado en la posicion del puntero.
     * @pre @pre 1 <= getPointerPosition() <= size()
     * @post new size() = pre size()-1
     */
    public void remove();

    /**
     * Incrementa en 1 el puntero de interés.
     * @pre 1 <= getPointerPosition() <= size()
     * @post 1 < getPointerPosition() <= size()+1
     * @return la posición del puntero tras el incremento.
     */
    public int movePointerForward();

    /**
     * Decrementa en 1 el puntero de interés.
     * @pre 1 < getPointerPosition() <= size()+1
     * @post 1 <= getPointerPosition() <= size()
     * @return la posición del puntero tras el decremento.
     */
    public int movePointerBackwards();

    /**
     * ¿Opcional? --> Lo he puesto aunque no es necesario (una idea mia).
     * @return IteratorIPIF
     */
    public IteratorIPIF<E> iterator();

}
