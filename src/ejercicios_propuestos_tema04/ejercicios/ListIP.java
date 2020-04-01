package ejercicios_propuestos_tema04.ejercicios;

import ejercicios_propuestos_tema04.dataStructures.ListIPIF;
import ejercicios_propuestos_tema04.dataStructures.Sequence;
import ejercicios_propuestos_tema04.dataStructures.Stack;

public class ListIP<E> extends Sequence<E> implements ListIPIF<E> {

    /**
     * Estructura de datos que almacena todos los elementos de la lista.
     */
    private Stack pilaA;
    /**
     * Estructura de datos auxiliar para almacenar los datos previos a la posicion de puntero.
     */
    private Stack pilaB;
    /**
     * Puntero, indicador de la posicion en la lista en la que se desea realizar modificaciones.
     */
    private int pointer;

    @Override
    public int getPointerPosition() {
        return pointer;
    }

    @Override
    public void setPointerPosition(int pos) {
        this.pointer = pos;
    }

    @Override
    public void insert(E elemento) {

    }

    @Override
    public void set(E elemento) {

    }

    /**
     * Se hace pop de pilaA hasta que alcanzar la posicion del puntero.
     * Los elementos eliminados se almacenan en pilaB.
     * @return
     */
    @Override
    public E get() {
        int contador = 0;
        while(contador < pointer){

        }
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public int movePointerForward() {
        return 0;
    }

    @Override
    public int movePointerBackwards() {
        return 0;
    }
}
