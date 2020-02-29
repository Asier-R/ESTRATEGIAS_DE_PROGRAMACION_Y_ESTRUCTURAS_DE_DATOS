package ejercicios_propuestos_tema01;

/**
 * Tema 1. Ejercicio 1.
 * Interfaz ListIPIF: Representa una lista de elementos con punto de interés.
 */
public interface ListIPIF<E> extends SequenceIF<E> {

    /**
     * Devuelve la posicion que tiene el puntero en ese momento.
     * @return posicion del puntero.
     */
    public int getPointerPosition();

    /**
     * Establece la posicion del puntero.
     */
    public void setPointerPosition();

    /**
     * Inserta un elemento en la posicion del puntero.
     * @param elemento elemento a insertar.
     */
    public void insert(E elemento);

    /**
     * Modifica el valor de la posicion del puntero.
     * @pre: !isEmpty()
     * @param elemento nuevo valor a introducir.
     */
    public void set(E elemento);

    /**
     * @pre !isEmpty()
     * @return E el elemento en la posicion actual del puntero.
     */
    public E get();

    /**
     * Elimina el elemento situado en la posicion del puntero.
     * @pre !isEmpty()
     */
    public void remove();

    /**
     * Incrementa en 1 el puntero de interés.
     * @pre 1 <= getPointerPosition() <= size()+1
     * @post getPointerPosition() += 1;
     * @return la posición del puntero tras el incremento.
     */
    public int movePointerForward();

    /**
     * Decrementa en 1 el puntero de interés.
     * @pre 1 < getPointerPosition() <= size()+1
     * @post getPointerPosition() -= 1;
     * @return la posición del puntero tras el decremento.
     */
    public int movePointerBackwards();

    /**
     * ¿Opcional? --> Lo he puesto aunque no es necesario (una idea mia).
     * @return IteratorIPIF
     */
    public IteratorIPIF<E> iterator();

}
