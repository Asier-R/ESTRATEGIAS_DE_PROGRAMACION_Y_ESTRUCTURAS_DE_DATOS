package capitulo_05;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{-1,0,2,3,-1,2,0};

        SubSecuenciaMax_Algoritmo_Lineal mej = new SubSecuenciaMax_Algoritmo_Lineal(a);

        System.out.println("LOG: maxSub = "+mej.maxSubsequenceSum());

        System.out.print("LOG: subsecuencia = ");
        for (int e: mej.nuevo) {
            System.out.print(e+" ");
        }

    }

}
