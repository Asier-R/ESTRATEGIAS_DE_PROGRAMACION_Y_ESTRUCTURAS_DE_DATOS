package ejercicios_propuestos_tema01;

public interface IteratorIF<E> {

    /**
     * Obtiene el siguiente elemento de la iteracion.
     * @pre hasNext()
     * @return E el siguiente elemento de la iteracion.
     */
    public E next();

    /**
     * Comprueba si aun quedan elementos que iterar.
     * @return true si el iterador dispone de mas elementos.
     */
    public boolean hasNext();

    /**
     * Vuelve la posición del iterador al principio.
     * Esto permite reutilizar un iterador sin crear otro nuevo.
     */
    public void reset();
}
