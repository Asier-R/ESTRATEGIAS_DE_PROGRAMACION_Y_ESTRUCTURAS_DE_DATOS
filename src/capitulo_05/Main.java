package capitulo_05;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{-1,0,22,3,-1,2,0};

        SubSecuenciaMax_Algoritmo_Lineal mej = new SubSecuenciaMax_Algoritmo_Lineal(a);

        System.out.println("LOG: maxSub = "+mej.maxSubsequenceSum());

        System.out.print("LOG: subsecuencia = ");
        for (int e: mej.nuevo) {
            System.out.print(e+" ");
        }

        System.out.println("BUSQUEDA BINARIA: \n");
        BinarySearch bin = new BinarySearch();
        Integer[] a1 = new Integer[]{0,1,3,5,7,9,11,22};
        System.out.println("Posicion: "+bin.binarySearch(a1,22));

    }

}
