package capitulo_04;

/**
 * Java no permite pasar funciones como parametros; solo valores primitivos y referencias.
 * Sin embargo, un objeto esta compuesto por datos y funciones. Asi que podemos integrar la funcion en un objeto y pasar
 * una referencia a este. Esta idea funciona en todos los lenguajes orientados a objetos.
 *
 * El objeto se conoce como objeto funcion y en ocasiones tambien se denomina functor.
 * El objeto funcion a menudo no contiene ningun dato. La clase contiene simplemente un unico metodo.
 */
public class objetoFunctor implements Comparator<Person> {

    public objetoFunctor(){
        // Clase creada solo para usar su funcion.
    }

    // La funcion que queremos pasar por parametros
    @Override
    public int compare(Person lhs, Person rhs) {
        if(lhs.getId() < rhs.getId()) return -1;
        else if (lhs.getId() > rhs.getId()) return 1;
        else return 0;
    }
}
