package ejercicios_propuestos_tema01;

public interface CollectionIF<E> {
    /**
     * @return Devuelve un numero entero que representa el tamaño de la coleccion.
     */
    public int size();

    /**
     * @return Devuelve un booleano que indica si la coleccion esta vacia o no.
     */
    public boolean isEmpty();

    /**
     * @param element el elemento que se quiere comprobar.
     * @return Devuelve un booleano que indica si el elemento esta presente en la coleccion o no.
     */
    public boolean contains (E element);

    /**
     * Vacia por completo la coleccion de elementos.
     */
    public void clear();
}
