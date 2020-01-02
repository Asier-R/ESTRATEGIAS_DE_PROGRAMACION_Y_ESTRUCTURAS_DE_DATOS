package capitulo_06;

/**
 * Interfaz List. Contiene mucho menos que la de java.util
 * @param <T>
 */
public interface List<T> extends Collection<T> {

    T get(int idx);
    T set(int idx);

    /**
     * Obtiene un objeto ListIterator que se usa para recorrer la coleccion bidireccionalmente.
     * @return un iterador posicionado antes del elemento solicitado.
     * @param pos el indice para iniciar el iterador.
     * Utilice size() para realizar un recorrido inverso completo.
     * Utilice 0 para realizar un recorrido completo en direccion normal.
     * @throws IndexOutOfBoundsException si pos no esta entre  0 y size(), ambos incluidos.
     */
    ListIterator<T> listIterator(int pos);


}
