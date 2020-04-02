package ejercicios_propuestos_tema04.ejercicios;

import ejercicios_propuestos_tema04.dataStructures.ListIPIF;
import ejercicios_propuestos_tema04.dataStructures.Sequence;
import ejercicios_propuestos_tema04.dataStructures.Stack;

import java.util.NoSuchElementException;

public class ListIP<E> extends Sequence<E> implements ListIPIF<E> {

    /**
     * Estructura de datos que almacena todos los elementos de la lista.
     */
    private Stack<E> pilaA;
    /**
     * Estructura de datos auxiliar para almacenar los datos previos a la posicion de puntero.
     */
    private Stack<E> pilaB;
    /**
     * Puntero, indicador de la posicion en la lista en la que se desea realizar modificaciones.
     */
    private int pointer;

    public ListIP(){
        this.pointer = 1;
        pilaA = new Stack<E>();
        pilaB = new Stack<E>();
    }

    @Override
    public int getPointerPosition() {
        return pointer;
    }

    @Override
    public void setPointerPosition(int pos) {
        this.pointer = pos;
    }

    @Override
    public void insert(E element) {
        if(1 <= pointer && pointer <= size()+1) {
            if(!pilaA.isEmpty() && pointer > 1) {
                remover(pointer);
                pilaA.push(element);
                restorer(pointer);
            }else{
                pilaA.push(element);
            }
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void set(E element) {
        remover(pointer);
        pilaA.pop();
        pilaA.push(element);
        restorer(pointer);
    }

    /**
     * Se hace pop de pilaA hasta que alcanzar la posicion del puntero.
     * Los elementos eliminados se almacenan en pilaB.
     * @return
     */
    @Override
    public E get() {
        if(1 <= pointer && pointer <= size()) {
            E top;
            remover(pointer);
            top = pilaA.getTop();
            restorer(pointer);
            return top;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Se hace pop de pilaA hasta que alcanzar la posicion del puntero.
     * Los elementos eliminados se almacenan en pilaB.
     */
    @Override
    public void remove() {
        remover(pointer);
        pilaB = new Stack<E>();
    }

    @Override
    public int movePointerForward() {
        if(pointer == size()+1)throw new IndexOutOfBoundsException("El puntero ya se encuentra en la primera posicion.");
        else return pointer++;
    }

    @Override
    public int movePointerBackwards() {
        if(pointer == 1)throw new IndexOutOfBoundsException("El puntero ya se encuentra en la primera posicion.");
        else return pointer--;
    }

    public int size(){
        return pilaA.size();
    }

    private void remover(int index){
        E aux;
        for(int i=1; i<index; i++){
            aux = pilaA.getTop();
            pilaA.pop();
            pilaB.push(aux);
        }
    }

    private void restorer(int index){
        E aux;
        for(int i=1; i<index; i++){
            aux = pilaB.getTop();
            pilaB.pop();
            pilaA.push(aux);
        }
    }

    public void printList(){
        E aux;
        int len = size();
        for(int i=0; i<len; i++){
            aux = pilaA.getTop();
            pilaA.pop();
            pilaB.push(aux);
            System.out.println("num "+(i+1)+"  : "+aux.toString());
        }
        restorer(size());
    }
}
