package capitulo_06;

import java.util.NoSuchElementException;

public interface Queue<T> extends Collection<T> {
    /**
     * Devuelve pero no elimina el elemento situado al "principio" de la cola.
     * @return el elemento inicial o null si la cola esta vacia.
     * @throws NoSuchElementException si la cola esta vacia.
     */
    T element();

    /**
     * Devuelve pero no elimina el elemento situado al "principio" de la cola.
     * @return el elemento inicial.
     * @throws NoSuchElementException si la cola esta vacia.
     */
    T remove();
}
