package ejercicios_propuestos_tema01;

public class Main {

    public static void main(String[] args) {
        // PRUEBAS //
        class ListIP<String> implements ListIPIF<String> {
            private int pointer = 0;
            private String[] lista;

            @Override
            public IteratorIPIF<String> iterator() {
                class ClaseInterna implements IteratorIPIF<String>{
                    @Override
                    public String previous() {return null;}
                    @Override
                    public boolean hasPrevious() {return false;}
                    @Override
                    public void resetFromLast() {}

                    @Override
                    public String next() {
                        if(hasNext()){
                            return lista[pointer++];
                        }else{
                            return null;
                        }
                    }

                    @Override
                    public boolean hasNext() {return false;}
                    @Override
                    public void reset() {}
                }

                ClaseInterna ci = new ClaseInterna();
                return ci;
            }

            @Override
            public int getPointerPosition() {return 0;}
            @Override
            public void setPointerPosition() {}
            @Override
            public void insert(String elemento) {}
            @Override
            public void set(String elemento) {}
            @Override
            public String get() {return null;}
            @Override
            public void remove() {}
            @Override
            public int movePointerForward() {return 0;}
            @Override
            public int movePointerBackwards() {return 0;}
            @Override
            public int size() {return 0;}
            @Override
            public boolean isEmpty() {return false;}
            @Override
            public boolean contains(String element) {return false;}
            @Override
            public void clear() {}

        }

        ListIP cos = new ListIP();

        IteratorIF<String> itr = cos.iterator();

        itr.hasNext();

    }
}
