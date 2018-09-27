package collections;

import interfaces.IHashTable;

public class HashTableList<A> implements IHashTable<A> {
	
	private LinkedList<A>[] table;
	private int size;
	private int m;
	
	public HashTableList(int m) {
		
		this.size = 0;
		this.m = m;
		table = new LinkedList[m];
		
		
	}

	@Override
	public int hashFunction(Number key) {
		return key.hashCode()%m;
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void insert(A element, Number key) {
		
		int pos = hashFunction(key);
		
		if(table[pos] == null) {
			
			LinkedList<A> list = new LinkedList<A>();
			table[pos] = list;
			table[pos].addLinkedListHash(element, key.intValue());
			size++;
		}else {
		
		table[pos].addLinkedListHash(element, key.intValue());
		size++;
		}
	}

	@Override 
	public void remove(A element, Number key) {
		
	
		int pos = hashFunction(key);
		try {
			table[pos].deleteLinkedList(element);
			size--;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public A Get(Number key) {
		
		int pos = hashFunction(key);
		A object = null;
		try {
			
			object = table[pos].findWithKey(key.intValue());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return object;
	}

}
