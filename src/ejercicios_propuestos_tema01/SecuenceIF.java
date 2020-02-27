package ejercicios_propuestos_tema01;

/**
 * Representa una secuencia, que es una colección de
 * elementos que se organizan linealmente.
 * @param <E>
 */
public interface SecuenceIF<E> extends CollectionIF<E> {

    /**
     * @return devuelve un iterador apropiado para la secuencia.
     * No necesita parametros puesto que el recorrido es lineal y unico.
     */
    public IteratorIF<E> iterator();
}
