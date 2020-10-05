package busquedas;

import grafos.Grafo;
import grafos.Nodo;

public abstract class Busqueda {
	
	protected Grafo grafo;
	
	public Busqueda(Grafo grafo) {
		this.grafo = grafo;
	}
	
	public abstract boolean hayRuta(Nodo nodo1, Nodo nodo2);

	public abstract boolean darPesoRuta(Nodo nodo1, Nodo nodo2) throws Exception;

}
