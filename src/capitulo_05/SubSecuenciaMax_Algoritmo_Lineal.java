package capitulo_05;
/**
 * Algoritmo lineal de suma maxima de subsecuencia contigua.
 * seqStart y seqEnd representan la mejor secuencia actual.
 */
public class SubSecuenciaMax_Algoritmo_Lineal {
    /**
     * Suma maxima.
     */
    int maxSum = 0;

    /**
     * Secuencia
     */
    int[] a;

    /**
     * Sub-Secuencia
     */
    int[] nuevo;

    /**
     * Constructor por defecto modificado.
     * Si se usa este constructor se creara un array vacio.
     */
    SubSecuenciaMax_Algoritmo_Lineal(){
        a=new int[]{0};
        new SubSecuenciaMax_Algoritmo_Lineal(a);
    }

    /**
     * Constructor principal
     */
    SubSecuenciaMax_Algoritmo_Lineal(int[] a){
        this.a = a;
    }

    /**
     * Realiza el calculo de la suma maxima
     * @return maxSum suma maxima de la secuencia
     */
    public int maxSubsequenceSum(){

        maxSum = 0;
        int thisSum = 0;
        int seqStart = 0;
        int seqEnd = 0;

        for(int i=0, j=0; j<a.length; j++){
            thisSum += a[j];

            if(thisSum > maxSum){
                maxSum = thisSum;
                seqStart = i;
                seqEnd = j;

            }else if(thisSum <= 0){
                i = j+1;
                thisSum = 0;
            }
        }

        subArray(seqStart,seqEnd);//guarda la subsecuencia
        return maxSum;
    }

    /**
     * Genera un subarray de a, acotado por los indices i y j
     */
    public void subArray(int i, int j){
        nuevo = new int[(j-i)+1];
        for(int k=i,n=0; k<=j; k++,n++) nuevo[n] = a[k];
    }

}
