package capitulo_06;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1,21,42,3,5,11,89};

        MyContainer con1 = new MyContainer(array);

        Iterator it = con1.iterator();

        while (it.hasNext()){
            System.out.print("\t"+it.next());
        }


    }

}
