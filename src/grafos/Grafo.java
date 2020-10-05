package grafos;

import java.util.ArrayList;

public abstract class Grafo {
	
	protected boolean conPeso = false;
	protected ArrayList<Nodo> nodos;
	protected ArrayList<Vertice> vertices;
	
	public Grafo(boolean conPeso) {
		this.conPeso = conPeso;
		this.nodos = new ArrayList<Nodo>();
		this.vertices = new ArrayList<Vertice>();
	}
	
	public boolean conPeso() {
		return this.conPeso;
	}
	
	public ArrayList<Nodo> darNodos() {
		return this.nodos;
	}
	
	public ArrayList<Nodo> darVertices() {
		return this.nodos;
	}
	
	public Nodo crearNodo(String nombre) {
		Nodo nodo = new Nodo(nombre);
		nodos.add(nodo);
		return nodo;
	}
	
	public void vincularNodosYVertice(Nodo nodo1, Nodo nodo2, Vertice vertice) {
		this.vertices.add(vertice);
		nodo1.agregarVertice(vertice);
		nodo2.agregarVertice(vertice);
	}
	
	public abstract void verificarVertices(Nodo nodo1, Nodo nodo2) throws Exception;
	
	public abstract void agregarVertice(Nodo nodo1, Nodo nodo2) throws Exception;

	public abstract void agregarVertice(Nodo nodo1, Nodo nodo2, int peso) throws Exception;
}
