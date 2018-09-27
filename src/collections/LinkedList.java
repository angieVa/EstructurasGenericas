package collections;
import interfaces.ILinkedList;

public class LinkedList<L> implements ILinkedList<L> {
	
	private NodeList<L> root;
	private NodeList<L> last;
	private int sizeL;
	
	
	public LinkedList() {
		
		root = null;
		
	}

	@Override
	public void addLinkedListAtLast(L element) {
		
		NodeList<L> newElement = new NodeList<L>(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			NodeList<L> aux = root;
			
			while(aux.getNext() != null) {
				
				aux = aux.getNext();
				
			}
			
			aux.setNext(newElement);
			sizeL++;			
		}
		
	}
	
	public void addLinkedListAtFirst(L element) {
		
		NodeList<L> newElement = new NodeList<L>(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			newElement.setNext(root);
			root = newElement;
			sizeL++;			
		}
		
	}

	@Override
	public void addCircularLinkedList(L element) {
		
		NodeList<L> newElement = new NodeList<L>(element);
		
		if(root == null) {
			
			setRoot(newElement);
			setLast(newElement);
			last.setNext(root);
			sizeL++;
			
		} else {
			
			last.setNext(newElement);
			setLast(newElement);
			last.setNext(root);
			sizeL++;			
		}
		
	}

	@Override
	public void addDoublyLinkedList(L element) {
		
		NodeList<L> newElement = new NodeList<L>(element);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			NodeList<L> aux = root;
			
			
			while(aux.getNext() != null) {
				
				
				aux = aux.getNext();
				
			}
			
			aux.setNext(newElement);
			newElement.setPrev(aux);
			sizeL++;
			
		}
		
	}

	@Override
	public void deleteLinkedList(L element) throws Exception {
		
		if(isEmptyL()) {
			
			throw new Exception("The list is empty");
			
		} if(sizeL == 1) {
			
			root = null;
			
		} else {
			
		NodeList<L> aux = root;
		NodeList<L> aux2 = null;
		NodeList<L> toFind = new NodeList<L>(element);
		boolean find = false;	
		
		
			while(aux != null && !find) {
				
				if(aux.getInfo().equals(toFind.getInfo())) {
					
					find = true;
					aux2.setNext(aux.getNext());
	 				sizeL--;
					
				} else if(!find && aux.getNext() == null) {
					
					throw new Exception("The element isn't in the list");
				
				}
				
				aux2 = aux;
				aux = aux.getNext();
				
			}
			
		}
		
	}

	@Override
	public boolean find(L element) throws Exception {
		
		boolean find = false;
		
		if(isEmptyL()) {
			
			throw new Exception("The list is empty");
			
		} else {
			
		NodeList<L> aux = root;
		NodeList<L> toFind = new NodeList<L>(element);
		
			while(aux != null && !find) {
				
				if(aux.getInfo().equals(toFind.getInfo())) {
					
					find = true;
		
				} 
				
				aux = aux.getNext();
				
			}
			
		}
		
		return find;
	}

	@Override
	public int sizeL() {
		
		return sizeL;
	}

	@Override
	public boolean isEmptyL() {
		
		if(sizeL == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}

	public NodeList<L> getRoot() {
		return root;
	}

	public void setRoot(NodeList<L> root) {
		this.root = root;
	}

	public NodeList<L> getLast() {
		return last;
	}

	public void setLast(NodeList<L> last) {
		this.last = last;
	}

	@Override
	public boolean findCircularLinkedList(L element) throws Exception {
		
		boolean find = false;
		
		if(isEmptyL()) {
			
			throw new Exception("The list is empty");
			
		} else {
			
		NodeList<L> aux = root;
		NodeList<L> toFind = new NodeList<L>(element);
		
			while(aux != last && !find) {
				
				if(aux.getInfo().equals(toFind.getInfo())) {
					
					find = true;
		
			} 
				
				aux = aux.getNext();
				
			}
			
			if(last.getInfo().equals(toFind.getInfo())) {
				
				find = true;
				
			}
			
		}
		
		return find;
		
	}

	@Override
	public void deleteDoublyLinkedList(L element) throws Exception {
		
		if(isEmptyL()) {
			
			throw new Exception("The list is empty");
			
		} if(sizeL == 1) {
			
			root = null;
			
		} else {
			
		NodeList<L> aux = root;
		NodeList<L> toFind = new NodeList<L>(element);
		boolean find = false;	
		
		
			while(aux != null && !find) {
				
				if(aux.getInfo().equals(toFind.getInfo())) {
					
					find = true;
					aux.getPrev().setNext(aux.getNext());
	 				sizeL--;
					
				} else if(!find && aux.getNext() == null) {
					
					throw new Exception("The element isn't in the list");
				
				}
				
				
				aux = aux.getNext();
				
			}
			
		}
		
	}

	@Override
	public void deleteCircularLinkedList(L element) throws Exception {
		
		if(isEmptyL()) {
			
			throw new Exception("The list is empty");
			
		} if(sizeL == 1) {
			
			root = null;
			
		} else {
			
		NodeList<L> aux = root;
		NodeList<L> aux2 = null;
		NodeList<L> toFind = new NodeList<L>(element);
		boolean find = false;	
		
		
			while(aux != last && !find) {
				
				if(aux.getInfo().equals(toFind.getInfo())) {
					
					find = true;
					aux2.setNext(aux.getNext());
	 				sizeL--;
					
				} 
				
				else if(aux.getInfo().equals(toFind.getInfo()) && !find) {
					
					find = true;
					aux2.setNext(root);
					
					
				}
				
				else if(!find && aux.getNext() == null) {
					
					throw new Exception("The element isn't in the list");
				
				}
				
				aux2 = aux;
				aux = aux.getNext();
				
			}
			
		}
		
	}

	public L findWithKey(int k) {
		
		L element = null;
		
		NodeList<L> aux = root;
		
		while(aux.getKey() != k && aux.getNext() != null) {
			
			aux = aux.getNext();
			
		}
		
		if(aux.getKey() == k) {
			
			
			element = aux.getInfo();
			
		}
		
		return element;
	}

	@Override
	public void addLinkedListHash(L element, int key) {
		
		NodeList<L> newElement = new NodeList<L>(element, key);
		
		if(root == null) {
			
			setRoot(newElement);
			sizeL++;
			
		} else {
			
			NodeList<L> aux = root;
			
			while(aux.getNext() != null) {
				
				aux = aux.getNext();
				
			}
			
			aux.setNext(newElement);
			sizeL++;			
		}
		
		
	}
	

}
