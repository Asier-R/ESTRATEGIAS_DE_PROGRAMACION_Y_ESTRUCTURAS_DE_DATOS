package capitulo_06;

public class MyContainer {

    Object[] items;
    int size;

    public MyContainer(){
        items = new Object[0];
    }

    public MyContainer(Object[] array){
        items = array;
        size = array.length;
    }

    public Iterator_2 iterator(){
        return new MyContainerIterator(this);
    }

}
