package ejercicios_propuestos_tema04.dataStructures;

/* Representa una secuencia, que es una colección de elementos  *
 * que se organizan linealmente.                                */
public interface SequenceIF<E> extends CollectionIF<E> {

	/* Devuelve el iterador sobre la secuencia. No necesita     *
	 * parámetros puesto que el recorrido es lineal y único.    */
	public IteratorIF<E> iterator (); 
}
