package main;

import java.io.IOException;
import java.util.Scanner;

import collections.HashTableList;
import collections.Heap;
import interfaces.IHashTable;
import interfaces.IHeap;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
//		Stack<String> pila = new EstructuraGenerica<String>();
//		
//		pila.push("hola mundo" );
//		pila.push("Melqui");
//		pila.push("5.0 en estructuras");
//
//		System.out.println(pila.size());
//		
//		try {
//			System.out.println(pila.pop());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
//		System.out.println(pila.size());
//		
//		System.out.println(pila.pop());
//		
		
		
//		
//		Queque<Integer> cola = new EstructuraGenerica<Integer>();
//		
//		cola.enqueque(1);
//		cola.enqueque(2);
//		cola.enqueque(3);
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
//		
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
//		System.out.println(cola.sizeQ());
//		
//		System.out.println(cola.dequeque());
//		
		
//		Balance balance = new Balance();
//		
//		System.out.println("Ingrese los datos");
//		
//		try {
//		balance.leer();
//		
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//	IHashTable<Integer> table = new HashTable<Integer>();
//	
//	table.insert(34, 10);
//	table.insert(50, 60);
//	
//	System.out.println(table.Get(10));
//	System.out.println(table.Get(60));
//	System.out.println(table.Get(85));	
//	
//	IHashTable<String> table1 = new HashTable<String>();
//	
//	table1.insert("ola mi vida", 35);
//	table1.insert("herez la unik en mi bida", 0);
//	
//	System.out.println(table1.Get(35));
//	System.out.println(table1.Get(0));
//	String pole = "uih";
//	System.out.println(pole.hashCode());
		
		IHashTable<String> table = new HashTableList<String>(6);

		table.insert("hola", 25);
		table.insert("hol", 2421);
		table.insert("gdd", 5645645);
		table.insert("hhk", 122);
		table.insert("scwq", 564);
		table.insert("sfesfe", 34454);
		table.insert("sfes2", 344);
		System.out.println(table.Size());
		System.out.println("");
		
		table.remove("hola", 25);
		System.out.println(table.Size());
		System.out.println("");
		System.out.println(table.Get(2421));
		
		System.out.println(table.Get(5645645));
		System.out.println(table.Get(122));
		System.out.println(table.Get(564));
		System.out.println(table.Get(344));
		System.out.println("");
		System.out.println(table.Size());
		
		
		
//		IHeap<Integer> heap = new Heap<Integer>(10);
//		
//		heap.insertMin(8, 8);
//		heap.insertMin(5, 5);
//		heap.insertMin(2, 2);
//		heap.insertMin(4, 4);
//		heap.insertMin(3, 3);
//		
//		heap.print();
//		System.out.println("");
//		System.out.println(heap.max());
//		System.out.println("");
////		System.out.println(heap.remove());
//		System.out.println("");
//		System.out.println(heap.size());
//		heap.insertMin(7, 7);
//		System.out.println("");
//		heap.print();
////		System.out.println(heap.remove());
//		heap.insertMin(6, 6);
//	
//		System.out.println("");
//		heap.print();
//		
//		System.out.println("");
//	//	System.out.println(heap.remove());
//		heap.insertMin(1, 1);
//		
//		System.out.println("");
//		heap.print();
//		System.out.println("");
//		System.out.println(heap.removeMin());
////		System.out.println(heap.remove());
//		System.out.println("");
//		heap.print();
//		System.out.println("");
//		System.out.println(heap.removeMin());
//		System.out.println("");
//		heap.print();
//		System.out.println("");
//		System.out.println(heap.removeMin());
//		System.out.println(heap.removeMin());
//		System.out.println(heap.removeMin());
//		System.out.println(heap.removeMin());
//		System.out.println("");
//		heap.print();
	}

}
