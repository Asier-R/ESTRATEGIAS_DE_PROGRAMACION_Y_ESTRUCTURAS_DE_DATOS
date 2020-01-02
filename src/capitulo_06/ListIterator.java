package capitulo_06;

/**
 * Interfaz ListIterator para la interfaz List.
 */
public interface ListIterator<T> extends Iterator {

    /**
     * Comprueba si hay mas elementos en la coleccion al realizar la iteracion en sentido inverso.
     * @return true si hay mas elementos en la coleccio al recorrerla en sentido inverso.
     */
    boolean hasPrevious();

    /**
     * Obtiene el elemento anterior de la coleccion.
     * @return el elemento anterior (todavia no viasualizado) de la coleccion al recorrerla en sentido inverso.
     */
    T previous();

    /**
     * Elimina el ultima elemento devuelto por next o previous.
     * Solo puede invocarse una unica vez despues de next o previous.
     */
    void remove();

}
