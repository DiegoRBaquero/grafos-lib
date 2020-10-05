package ejemplo;

import java.util.ArrayList;

import busquedas.*;
import grafos.*;

public class EjemploGrafoConPesoDirigido {

	public static void main(String[] args) {
		System.out.println("Creando grafo dirigido con peso");
		Grafo grafo = new GrafoDirigido(true);
		System.out.println("Creando nodos a y b");
		Nodo a = grafo.crearNodo("A");
		Nodo b = grafo.crearNodo("B");
		
		try {
			grafo.agregarVertice(a, b);
		} catch (Exception e) {
			System.out.println("Efectivamente no deja agregar el vertice sin peso");
		}
		try {
			grafo.agregarVertice(a, b, 1);
		} catch (Exception e) {
			// No debería ocurrir
			System.err.println(e);
			return;
		}
		try {
			grafo.agregarVertice(b, a, 2);
		} catch (Exception e) {
			// No debería ocurrir
			System.err.println(e);
			return;
		}
		
		System.out.println("Creando nodo c");
		Nodo c = grafo.crearNodo("C");
		
		try {
			grafo.agregarVertice(a, c, 3);
		} catch (Exception e) {
			// No debería ocurrir
			System.err.println(e);
			return;
		}
		try {
			grafo.agregarVertice(b, c, 2);
		} catch (Exception e) {
			// No debería ocurrir
			System.err.println(e);
			return;
		}
		
		Busqueda busq = new BFS(grafo);
		ArrayList<Nodo> nodos = grafo.darNodos();
		boolean hayRuta = busq.hayRuta(nodos.get(0), nodos.get(2));
		
		System.out.println(hayRuta ? "Hay ruta entre A y C" : "No hay ruta entre A y C");
		
		System.out.println("Terminado");
	}

}
