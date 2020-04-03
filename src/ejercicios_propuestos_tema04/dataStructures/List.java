package ejercicios_propuestos_tema04.dataStructures;


public class List<E> extends Sequence<E> implements ListIF<E> {

	/* Constructor por defecto: crea una lista vacía */
	public List(){
		super();
	}
	
	/* Constructor por copia: delega en el constructor por copia *
	 * de la secuencia                                           */
    public List(List<E> s) {
    	super(s);
    }
	
    /* Devuelve el elemento pos-ésimo de la lista */
	public E get(int pos) {
		NodeSequence node = getNode(pos);
		return node.getValue();
	}

	/* Modifica el elemento pos-ésimo de la lista */
	public void set(int pos, E e) {
		NodeSequence node = getNode(pos);
		node.setValue(e);
	}

	/* Inserta un nuevo elemento en la lista en la posición *
	 * indicada                                             */
	public void insert(int pos, E elem) {
		NodeSequence newNode = new NodeSequence(elem);
		if(pos==1){
			newNode.setNext(this.firstNode);
			this.firstNode = newNode;
		}else{
			NodeSequence previousNode = getNode(pos-1);
			NodeSequence nextNode = previousNode.getNext();
			previousNode.setNext(newNode);
			newNode.setNext(nextNode);
		}
		this.size++;
	}

	/* Elimina el elemento pos-ésimo de la lista */
	public void remove(int pos) {
		if(pos==1){
			this.firstNode = this.firstNode.getNext();
		}else{
			NodeSequence previousNode = getNode(pos-1);
			NodeSequence nextNode = previousNode.getNext().getNext();
			previousNode.setNext(nextNode);
		}
		this.size--;
	}

	public ListIF<E> invierte(ListIF<E> list){
		List lista = new List();
		for(int i=1; i<list.size()+1; i++){
			lista.insert(1,list.get(i));
		}
		return lista;
	}

	public ListIF<E> invierteIt(ListIF<E> list){
		List lista = new List();
		IteratorIF it = list.iterator();
		while(it.hasNext()){
			lista.insert(1, it.getNext());
		}
		return lista;
	}

	public <E extends Comparable<? super E>> boolean isOrderedASC(ListIF<E> lista){
		for(int i=0; i<lista.size(); i++){
			if(lista.get(i).compareTo(lista.get(i+1)) > 0){
				return false;
			}
		}
		return true;
	}
}
