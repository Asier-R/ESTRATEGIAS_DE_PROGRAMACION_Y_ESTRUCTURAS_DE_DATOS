package capitulo_03;

import java.math.BigInteger;
import static java.lang.Math.*;

public class Main{

    public static void main(String[] args) {
        //Extension miTen = new Extension();
        //Thread hilo = new Thread(miTen);
        //hilo.start();

        /*Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 ints on one line: ");
        try{
            String linea = in.nextLine();
            Scanner str = new Scanner(linea);

            int x = str.nextInt();
            int y = str.nextInt();

            if(!str.hasNext()){
                System.out.println("Max: "+Math.max(x,y));
            }else{
                System.out.println("Error extraneous data on the line5");
            }

            str.close();

        }catch (NoSuchElementException e){
            System.out.println("Error need two ints");
        }finally {
            in.close();
        }

        System.out.println("Scanner instanceof Object: "+(in instanceof Object));

        System.out.println(Extension.a);
        Extension.a++;
        System.out.println(Extension.a);*/

        BigRational bg = new BigRational(new BigInteger("1"),new BigInteger("3"));
        BigRational bg2 = new BigRational(new BigInteger("3"),new BigInteger("2"));
        BigRational bg3 = new BigRational(new BigInteger("3"),new BigInteger("2"));

        BigRational bgR = bg.divide(bg2);
        System.out.println("RESULTADO: "+bgR.toString());

        System.out.println("bg==bg2? --> "+(bg==bg2));
        System.out.println("bg2==bg3? --> "+(bg2==bg3));
        System.out.println("bg equals bg2? --> "+(bg.equals(bg2)));
        System.out.println("bg2 equals bg3? --> "+(bg2.equals(bg3)));

        System.out.println("Usar el numero PI sin escribir Math.PI --> "+PI);
        System.out.println("Para ello importamos el paquete Math de la siguiente manera: import java.lang.Math.*;");

    }

}
