package capitulo_06;

class MyContainerIterator implements Iterator_2 {

    private int current = 0;
    private MyContainer container;

    MyContainerIterator(MyContainer container){
        this.container = container;
    }

    public boolean hasNext(){
        return current < container.size;
    }

    public Object next(){
        return container.items[current++];
    }

    @Override
    public void remove() {

    }

}
