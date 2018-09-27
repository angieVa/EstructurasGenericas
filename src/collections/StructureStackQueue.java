package collections;

import interfaces.Queque;
import interfaces.Stack;

public class StructureStackQueue<A> implements Stack<A>, Queque<A>{
	
	private NodoPQ<A> inicio;
	private int size;
	private int sizeq;
	private NodoPQ<A> last;
	
	
	public StructureStackQueue() {
	
		this.inicio = null;
		this.size = 0;
		this.sizeq = 0;
		this.last = null;
	}
	
	//STACK 


	@Override
	public void push(A a) {
		
		NodoPQ<A> New = new NodoPQ<A>(a);
		
		if(isEmpty()) {
			
			inicio = New;
		}else {
			
			New.setNext(inicio);
			inicio = New;
		}
		
		size++;
		
	}
	
	

	@Override
	public A pop() throws Exception{
		
		if(!isEmpty()) {
			
			A element = inicio.getElement();
			inicio = inicio.getNext();
			size--;
			return element;
		}else {
			
			throw new Exception("La pila esta vacia");
		}
		
	}

	
	@Override
	public A top() throws Exception {
		
		if(!isEmpty()) {
			return inicio.getElement();
		}else {
			throw new Exception("La pila se encuentra vacia");
			
		}
	
	}

	@Override
	public boolean isEmpty() {
		
		return inicio == null;
	}

	@Override
	public void removeAll() {
		inicio = null;
		size = 0;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	
	//QUEQUE
	
	
	@Override
	public void enqueque(A a) {
		
		NodoPQ<A> New = new NodoPQ<A>(a);
		
		if(isEmptyQ()) {
			
			inicio = New;
		}else {
			last.setNext(New);
		}
		last = New;
		sizeq++;
	}

	@Override
	public A front() throws Exception {
		
		if(!isEmptyQ()) {
			
			return inicio.getElement();
		}else {
			
			throw new Exception("La cola esta vacia");
		}
		
	}
	

	@Override
	public A dequeque() throws Exception {
		
		if(!isEmptyQ()) {
			NodoPQ<A> first = inicio;
			if(inicio == last) {
				last = null;
			}else {
				inicio = inicio.getNext();
			}
			sizeq--;
			return first.getElement();
			
		}else {
			throw new Exception("La cola esta vacia");
		}
		
	}

	@Override
	public int sizeQ() {
		// TODO Auto-generated method stub
		return sizeq;
	}

	@Override
	public boolean isEmptyQ() {
		
		return last == null;
	}
	
	
	
	
	
	


	
	
	

}
