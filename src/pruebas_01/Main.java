package pruebas_01;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        //Extension miTen = new Extension();
        //Thread hilo = new Thread(miTen);
        //hilo.start();

        Scanner in = new Scanner(System.in);

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
        System.out.println(Extension.a);

    }

}
