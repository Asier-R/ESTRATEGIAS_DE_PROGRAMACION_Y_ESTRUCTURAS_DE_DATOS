package ejercicios_propuestos_tema04.ejercicios;

import capitulo_04.Comparator;
import ejercicios_propuestos_tema04.dataStructures.IteratorIF;
import ejercicios_propuestos_tema04.dataStructures.List;
import ejercicios_propuestos_tema04.dataStructures.ListIF;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("/------------------ EJERCICIO 04 ------------------/");
        ListIP<String> miLista = new ListIP<String>();
        miLista.insert("Uno");
        miLista.insert("Dos");
        miLista.insert("Tres");
        miLista.insert("Cuatro");
        miLista.printList();
        System.out.println("------------------------------------");
        miLista.printList();
        System.out.println("------------------------------------");
        miLista.setPointerPosition(1);
        miLista.remove();
        miLista.printList();
        System.out.println("------------------------------------");
        miLista.remove();
        miLista.printList();
        miLista.setPointerPosition(3);
        miLista.insert("X");
        miLista.setPointerPosition(1);
        miLista.insert("Y");
        System.out.println("------------------------------------");
        miLista.printList();

        System.out.println("/------------------ EJERCICIO 05 ------------------/");
        ListIF<String> lista = new List<String>();
        lista.insert(1,"Uno");
        lista.insert(1,"Dos");
        lista.insert(1,"Tres");
        lista.insert(1,"Cuatro");
        lista.insert(1,"Cinco");
        IteratorIF it = lista.iterator();
        while(it.hasNext()){
            System.out.println("--> "+it.getNext());
        }
        System.out.println("------------------------------------");
        lista = lista.invierte(lista);
        it = lista.iterator();
        while(it.hasNext()){
            System.out.println("--> "+it.getNext());
        }
        System.out.println("------------------------------------");
        lista = lista.invierteIt(lista);
        it = lista.iterator();
        while(it.hasNext()){
            System.out.println("--> "+it.getNext());
        }

        System.out.println("/------------------ EJERCICIO 06 ------------------/");
        List<String> listaDesor = new List<String>();
        listaDesor.insert(1,"a");
        listaDesor.insert(1,"z");
        listaDesor.insert(1,"d");
        listaDesor.insert(1,"b");
        System.out.println(listaDesor.isOrderedASC(listaDesor));
        it = listaDesor.iterator();
        while(it.hasNext()){
            System.out.println("--> "+it.getNext());
        }
        System.out.println("------------------------------------");
        List<String> listaOrdenada = new List<String>();
        listaOrdenada.insert(1,"a");
        listaOrdenada.insert(1,"b");
        listaOrdenada.insert(1,"c");
        listaOrdenada.insert(1,"d");
        System.out.println(listaOrdenada.isOrderedASC(listaOrdenada));
        it = listaOrdenada.iterator();
        while(it.hasNext()){
            System.out.println("--> "+it.getNext());
        }
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        List<String> listaOrdenada2 = new List<String>();
        listaOrdenada2.insert(1,"d");
        listaOrdenada2.insert(1,"c");
        listaOrdenada2.insert(1,"b");
        listaOrdenada2.insert(1,"a");
        System.out.println(listaOrdenada2.isOrderedASC(listaOrdenada2));
        it = listaOrdenada2.iterator();
        while(it.hasNext()){
            System.out.println("--> "+it.getNext());
        }
        System.out.println("------------------------------------");


    }


}
