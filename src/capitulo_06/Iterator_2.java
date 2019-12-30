package capitulo_06;

/**
 * Interfaz Iterator.
 * @param <T>
 */
public interface Iterator_2<T> extends java.util.Iterator<T> {

    /**
     * Comprueba si hay elementos sobre lo que todavia no se haya iterado.
     */
    boolean hasNext();

    /**
     * Obtiene el siguiente elemento (todavia no visualizado) de la coleccion.
     */
    T next();

    /**
     * Elimina el ultimo elemento devuelto por next.
     * Solo se puede invocar una vez despues de invocar next.
     */
    void remove();
}
