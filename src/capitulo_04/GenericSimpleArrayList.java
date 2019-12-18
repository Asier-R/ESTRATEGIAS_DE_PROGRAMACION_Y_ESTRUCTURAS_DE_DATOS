package capitulo_04;
/**
 * GenericSimpleArrayList ampliable de Object.
 * Las inserciones siempre se hacen al final.
 */
public class GenericSimpleArrayList<T> {
    /*---------- VARIABLES -------------------------------------------------------------------------------------------*/

    /**
     * Capacidad inicial del arraylist
     */
    private static final int INIT_CAPACITY = 10;

    /**
     * Tamaño actual del arraylist
     */
    private int theSize = 0;

    /**
     * El array que funcionara como arraylist
     */
    private T [] theItems = (T[]) new Object [INIT_CAPACITY];

    /*----------------------------------------------------------------------------------------------------------------*/
    /*---------- METODOS ---------------------------------------------------------------------------------------------*/

    /**
     * Devuelve el número de elementos de esta colección.
     * @return el número de elementos de esta colección.
     */
    public int size(){
        return theSize;
    }

    /**
     * Devuelve el elemento en la posición idx.
     * @param index el índice que hay que buscar.
     * @throws ArrayIndexOutOfBoundsException si el índice es incorrecto.
     */
    public T get(int index){
        if(index<0 || index>=size())
            throw new ArrayIndexOutOfBoundsException();
        return theItems[index];
    }

    /**
     * Añade un elemento al final de esta colección.
     * @param elemento cualquier objeto
     * @return true
     */
    public boolean add(T elemento){
        if(theItems.length == size()){
            T [] old  = theItems;
            theItems = (T [])new Object[size()*2+1];
            for (int i = 0; i<size(); i++)
                theItems[i] = old[i];
        }
        theItems[theSize++] = elemento;
        return true;

    }

    /*----------------------------------------------------------------------------------------------------------------*/
}
