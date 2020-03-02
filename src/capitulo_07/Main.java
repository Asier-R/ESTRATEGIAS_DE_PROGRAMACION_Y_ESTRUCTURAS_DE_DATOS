package capitulo_07;

public class Main {
    /**
     * Metodo main.
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * Una rutina recursiva para imprimir N en forma decimal.
     * Imprimir n en base 10, de forma recursiva.
     * @pre n >= 10
     * @param n
     */
    public static void printDecimal(long n){
        if(n>=10){
            printDecimal(n/10);
        }
        System.out.println((char)('0'+(n%10)));
    }

    /**
     * Rutina recursiva para imprimir N en cualquier base.
     */
    public static final String DIGIT_TABLE="0123456789abcdef";

    /**
     * Imprimir n en cualquier base de forma recursiva.
     * @pre n >= 0, base es valida.
     * @param n
     * @param base
     */
    public static void printInt(long n, int base){
        if(n >= base){
            printInt(n/base, base);
        }
        System.out.println(DIGIT_TABLE.charAt((int)(n % base)));
    }

}
