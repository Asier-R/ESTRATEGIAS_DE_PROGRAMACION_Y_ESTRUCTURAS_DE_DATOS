package ejercicios_propuestos_tema02;

/**
 * TEMA 2: Recurisividad
 *
 * Desarrollo de los ejercicios propuestos del tema 2
 *
 */
public class Main {
    //PRUEBAS
    public static void main(String[] args) {
        System.out.println("Factorial de 5 --> 5! = "+factorial(5));
        System.out.println("-------------------------------------------");
        System.out.println("Quinto numero de Fiboncci recursivo malo: "+fibonacci(25));
        System.out.println("-------------------------------------------");
        System.out.println("Quinto numero de Fiboncci recursivo bueno: "+fibonacciR(25));
        System.out.println("-------------------------------------------");
        System.out.println("Quinto numero de Fiboncci (no recursivo, eficiente): "+fibonacciW(25));
        System.out.println("-------------------------------------------");
        System.out.println("Exponecial recursivo malo: "+exponencial(15,3));
        System.out.println("-------------------------------------------");
        System.out.println("Exponecial recursivo bueno: "+exponencialR(15,3));
        System.out.println("-------------------------------------------");
        System.out.println("Exponecial recursivo optimizado: "+potenciaOptimizado(15,3));
        System.out.println("-------------------------------------------");

    }

    /**
     * Caso no recursivo: n<=0 --> 0!=1 (se devuelve un 1, y seria el fin de la recursion)
     * Caso recursivo: n > 0
     * @pre n >= 0
     * @param n numero entero cuyo factorial se va a calcular
     * @return el factorial de n
     */
    public static int factorial(int n){
        if(n>0)return n*factorial(n-1);
        return 1;
    }

    /**
     * Notas:
     * Regla del interes compuesto --> nunca duplique el trabajo resolviendo la misma instancia
     *                                 de un problema en llamadas consecutivas separadas.
     *
     * La implementacion recursiva de la serie de Fibonacci no respeta la regla del interes compuesto. Se realizan
     * llamadas duplicadas del mismo problema:
     *
     * Para F(5) --> F(5) = F(4) + F(3)
     *                        .    F(3) = F(2) + F(1)
     *                        .      .    F(2) = F(1) + F(0)
     *                      F(4) = F(3) + F(2)     .      .
     *                             F(3) = F(2) + F(1)     .
     *                                    F(2) = F(1) + F(0)
     *
     * Dos alternativas:
     *  1. Alternativa recursiva --> public fibonacciR(int n) & private fibonacciR(int n, int a, int b)
     *  2. Alternativa no recursiva mediante un bucle while --> fibonacciW(int n);
     *
     * Caso no recursivo: n <= 1
     * Caso recursivo: n > 1
     * @pre n > 0
     * @param n posicion del n-esimo elemento de la serie Fibonacci
     * @return n-esimo elemento de la serie Fibonacci
     */
    public static int fibonacci(int n){
            if(n <= 1) return 1;
            return fibonacci(n-1)+fibonacci(n-2);
    }

    /* Método 1, original */
    /**
     * Metodo publico con signatura sencilla que llama al metodo recursivo.
     * @pre n > 0
     * @param n posicion del n-esimo elemento de la serie Fibonacci
     * @return n-esimo elemento de la serie Fibonacci
     */
    public static long fibonacciR(long n) {
        return fibonacciR(n, 0, 1); // llamar a la sobrecarga
    }

    /* Método sobrecargado, con 2 parámetros adicionales*/
    /**
     * Metodo privado con signatura extendida que realiza la recursividad.
     * @pre n > 0 && a > 0 && b >=0
     * @param n n posicion del n-esimo elemento de la serie Fibonacci
     * @param a primer numero fibonacci a sumar
     * @param b segundo nuemro fibonacci a sumar
     * @return n-esimo elemento de la serie Fibonacci
     */
    public static long fibonacciR(long n, long a, long b) {
        if(n <= 1) return a+b;
        else return fibonacciR(n-1, b, a+b);
    }

    /**
     * Alternativa eficiente al metodo recursivo de fibonacci.
     * @param pos posicion del n-esimo elemento de la serie Fibonacci
     * @return n-esimo elemento de la serie Fibonacci
     */
    public static int fibonacciW(int pos){
        int a=1,b=0,f=0;

        while(pos>0){
            f = a + b;
            b=a;
            a=f;
            pos--;
        }

        return f;
    }

    /**
     * Caso no recursivo: exp == 0 || exp == 1
     * Caso recursivo: exp > 1
     *
     * Es necesario diferenciar el exponente par del impar, cada uno tendra un trato distinto.
     * Exponente par dos llamadas, multiplicadas entre si, a la funcion.
     * Exponente impar tres llamadas, multiplicadas entre si, a la funcion.
     *
     * Esta funcion exponencial recursiva no es eficiente. Se duplican/triplican llamadas, esto contradice la regla
     * del interes compuesto.
     *
     * @param n numero entero que servira de base
     * @param exp numero entero que servira de exponente
     * @return resultado base n elevado a exp (exponenciacion de n)
     */
    public static int exponencial(int n, int exp){
        if(exp==0) return 1;
        if(exp==1) return n;
        if(exp%2==0) return exponencial(n,exp/2)*exponencial(n,exp/2);
        return exponencial(n,exp/2)*exponencial(n,exp/2)*exponencial(n,exp/2);
    }

    /**
     * Alternativa recursiva buena para calcular el exponencial.
     * @param base numero entero que servira de base
     * @param exp numero entero que servira de exponente
     * @return resultado de base elevado a exp (exponenciacion de base)
     */
    public static int exponencialR(int base, int exp){
        if(exp<1)return 1;
        return base*exponencialR(base,exp-1);
    }

    public static int potenciaOptimizado(int base, int exp){
        if(exp==0)return 1;
        int rec = potenciaOptimizado(base, exp/2);
        if(exp%2==0)return rec*rec;
        else return base*rec*rec;
    }

}
