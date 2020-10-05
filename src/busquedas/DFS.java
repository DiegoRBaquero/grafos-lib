package busquedas;

import grafos.Grafo;
import grafos.Nodo;

public class DFS extends Busqueda {

	public DFS(Grafo grafo) {
		super(grafo);
	}

	@Override
	public boolean hayRuta(Nodo nodo1, Nodo nodo2) {
		return false;
	}

	@Override
	public boolean darPesoRuta(Nodo nodo1, Nodo nodo2) throws Exception {
		if(!this.grafo.conPeso()) {
			throw new Exception("No es un grafo con peso");
		}
		return false;
	}

}
