package interfaces;

import collections.NodeList;

public interface ILinkedList<L> {
	//Metodos agregar de cada tipo de lista
	public void addLinkedListHash(L element, int key);
	public void addLinkedListAtLast(L element);
	public void addLinkedListAtFirst(L element);
	public void addCircularLinkedList(L element);
	public void addDoublyLinkedList(L element);
	
	//Metodos eliminar para cada tipo de lista
	public void deleteLinkedList(L element) throws Exception;
	public void deleteDoublyLinkedList(L element) throws Exception;
	public void deleteCircularLinkedList(L element) throws Exception;
	
	//Metodos buscar
	public boolean find (L element) throws Exception;
	public boolean findCircularLinkedList (L element) throws Exception;
	
	//Otros métodos
	public int sizeL();
	public boolean isEmptyL();
	public NodeList getRoot();
	public L findWithKey(int k);

}
