package capitulo_03;

public class Squares{

    private static double [] squareRoots = new double [100];

    static {
        for (int i=0; i<squareRoots.length; i++)
            squareRoots[i]=Math.sqrt((double)i);
    }

    // Resto de la clase
}




