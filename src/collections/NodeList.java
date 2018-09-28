package collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class NodeList<N> {
	
	private N info;
	private NodeList<N> next;
	private NodeList<N> prev;
	private int priority;
	private int key;
	
	public NodeList(N info) {
		
		this.info = info;
		
	}
	
	public NodeList(N info, int key) {
		
		this.info = info;
		this.key = key;
	}
	
	public NodeList( int priority, N info) {
		
		this.info = info;
		this.priority = priority;
		
	}
	
	
	public N getInfo() {
		return info;
	}

	public void setInfo(N info) {
		this.info = info;
	}

	public NodeList<N> getNext() {
		return next;
	}
	
	public void setNext(NodeList<N> next) {
		this.next = next;
	}

	public NodeList<N> getPrev() {
		return prev;
	}

	public void setPrev(NodeList<N> prev) {
		this.prev = prev;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}
	
	

//	for(long i = 0; i< casos; i++) {
//		long productos = 0;
//		
//		try {
//			String[] cp = br.readLine().split(" ");
//			int numCajeros = Integer.parseInt(cp[0]);
//			int numPersonas = Integer.parseInt(cp[1]);
//			
//			Almacen al = new Almacen(numCajeros);
//			
//			
//			for(int j = 0; j < numPersonas; j++) {
//				String[] p = br.readLine().split(" ");
//				
//				String id = p[0];
//				int numProductos = Integer.parseInt(p[1]);
//				productos += numProductos;
//				
//				al.agregarCliente(new Cliente(id, numProductos ));
//				
//			}
//			
//			al.despachar(productos);
//			

	
	
//
//	public void leer() throws IOException{
//		
//		String resultado = "";
////		String ruta = "datos/testCases.txt";
////		
////		FileReader fr = new FileReader(ruta);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		long casos = Long.parseLong(br.readLine());
//		String linea = "";
//		
//		for(long i = 0; i< casos; i++) {
//			
//			linea = br.readLine();
//			
//			resultado = balance(linea);
//			bw.write(resultado);
//			bw.write("\n");
//			bw.flush();
//		
//		}
//
}
