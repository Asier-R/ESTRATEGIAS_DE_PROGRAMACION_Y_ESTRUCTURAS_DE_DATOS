package ejercicios_propuestos_tema01;

/**
 * Tema 1. Ejercicio 1.
 * Interfaz IteratorIPIF: Un iterador ampliado para ListIPIF.
 * ¿Opcional? Una idea mia.
 */
public interface IteratorIPIF<E> extends IteratorIF<E>{

    /**
     * Hace retroceder el puntero una posicion hacia atras.
     * @pre !isEmpty() && 1 < size() && hasPrevious()
     * @return E el siguiente elemento de la iteracion.
     */
    public E previous();

    /**
     * Comprueba que haya algun elemento mas detras del puntero.
     * @pre !isEmpty() && 1 < size()
     */
    public boolean hasPrevious();

    /**
     * Vuelve la posición del iterador al final.
     * Esto permite reutilizar un iterador sin crear otro nuevo.
     */
    public void resetFromLast();
}
