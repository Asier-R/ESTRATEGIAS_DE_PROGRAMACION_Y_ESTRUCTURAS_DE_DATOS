package ejercicios_propuestos_tema01;

/**
 * Tema 1. Ejercicio 3.
 * Interfaz SequenceMS: Representa una secuencia de tamaño maximo.
 * ¿Duda? --> Debe heredar de Collection o de SequenceIF
 * @param <E> el tipo de dato que contendra la secuencia.
 */
public interface SequenceMS<E> extends CollectionIF<E> {

    /**
     * @pre 0 < size()
     * @return devuelve el tamaño maximo de la secuencia.
     * Establecer el tamaño maximo es responsabilidad del Tipo de Dato y su Estructura de Datos.
     * (A traves de su constructor establecer el valor de una variable final)
     */
    public int getMaxSize();

    /**
     * @return devuelve un iterador apropiado para la secuencia.
     * No necesita parametros puesto que el recorrido es lineal y unico.
     */
    public IteratorIF<E> iterator();

}
