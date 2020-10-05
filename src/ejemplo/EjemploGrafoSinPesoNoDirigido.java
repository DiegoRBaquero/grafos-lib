package ejemplo;

import grafos.*;

public class EjemploGrafoSinPesoNoDirigido {

	public static void main(String[] args) {
		System.out.println("Creando grafo no dirigido sin peso");
		Grafo grafo = new GrafoNoDirigido(false);
		System.out.println("Creando nodos a y b");
		Nodo a = grafo.crearNodo("A");
		Nodo b = grafo.crearNodo("B");
		
		try {
			grafo.agregarVertice(a, b);
		} catch (Exception e1) {
			// No debería ocurrir
			return;
		}
		try {
			grafo.agregarVertice(b, a);
		} catch (Exception e) {
			System.out.println("Efectivamente no deja agregar el vertice en sentido contrario");
		}
		
		System.out.println("Creando nodo c");
		Nodo c = grafo.crearNodo("C");
		
		try {
			grafo.agregarVertice(a, c, 5);
		} catch (Exception e) {
			System.out.println("Efectivamente no deja agregar el vertice con peso");
		}
		try {
			grafo.agregarVertice(a, c);
		} catch (Exception e) {
			// No debería ocurrir
			return;
		}
		
		System.out.println("Terminado");
	}

}
