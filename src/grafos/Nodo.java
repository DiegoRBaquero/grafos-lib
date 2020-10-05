package grafos;

import java.util.ArrayList;

public class Nodo {
	
	private String nombre;
	private ArrayList<Vertice> vertices;
	
	public Nodo(String nombre) {
		this.nombre = nombre;
		this.vertices = new ArrayList<Vertice>();
	}

	public String darNombre() {
		return this.nombre;
	}
	
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Vertice> darVertices() {
		return this.vertices;
	}
	
	public void agregarVertice(Vertice vertice) {
		this.vertices.add(vertice);
	}
	
	public void quitarVertice(Vertice vertice) {
		this.vertices.remove(vertice);
	}
	
}
