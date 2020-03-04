package capitulo_07;

public class Main {
    /**
     * Metodo main.
     * @param args
     */
    public static void main(String[] args) {
        printDecimal(1369);
        printDecimal(12);
        System.out.println("n%10: "+(13%10));
        System.out.println("n%10: "+(12%10));
        System.out.println("n%10: "+((char)('0'+(1%10))));
        System.out.println("-- 16 ---------------------------");
        printInt(12,16);
        System.out.println("-- 8 ---------------------------");
        printInt(12,8);
        System.out.println("-- 2 ---------------------------");
        printInt(12,2);
        System.out.println("--------------------------------");
        System.out.println("n%base: "+((12)%2));
        System.out.println("n%base: "+((12/2)%2));
        System.out.println("n%base: "+((6/2)%2));
        System.out.println("n%base: "+((3/2)%2));
        System.out.println("--------------------------------");
        System.out.println("n%base: "+(1%8));
        System.out.println("n%base: "+(1%16));
        System.out.println("--------------------------------");
        //printInt(12,1);//Caso que falla


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
        System.out.println((char)('0'+(n%10))+"    n: "+n);
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
