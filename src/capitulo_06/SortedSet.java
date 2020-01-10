package capitulo_06;

import capitulo_04.Comparator;

import java.util.NoSuchElementException;

/**
 * Interfaz SortedSet.
 * @param <T>
 */
public interface SortedSet<T> extends Set<T> {
    /**
     * Devuelve el comparador utilizado por este SortedSet.
     * @return el comparador o null si se utiliza el comparador predeterminado.
     */
    Comparator<? super T> comparator();

    /**
     * Encuentra el elemento mas pequeño del conjunto.
     * @return el elemento mas pequeño.
     * @throws NoSuchElementException si el conjunto esta vacio.
     */
    T first();

    /**
     * Encuentra el elemento mas grande del conjunto.
     * @return el elemento mas grande.
     * @throws NoSuchElementException si el conjunto esta vacio.
     */
    T last();
}
