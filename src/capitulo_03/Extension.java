package capitulo_03;
/**
 * Una clase que suma de uno en uno cada segundo
 * mediante el uso de la interfaz Runnable
 * @version 1.0
 * @author Asier R.
 */
public class Extension  implements Runnable {
    public static int a;

    static{
        a=999;
    }

    public Extension(){

    }
    /**
     * Sumar de uno en uno
     */
    public void sumar(){
        System.out.println("a: "+String.valueOf(a++));
    }
    /**
     * Metodo implementado de Runnable
     * Hace uso de la clase Thread y su metodo sleep para realizar una pausa de un segundo
     * @see Thread
     */
    @Override
    public void run() {
        while(true){
            try {Thread.sleep(1);}
            catch (InterruptedException e)
                {e.printStackTrace();}
            sumar();
        }
    }
}
