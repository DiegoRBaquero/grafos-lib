package busquedas;

import grafos.Grafo;
import grafos.Nodo;

public class BFS extends Busqueda {

	public BFS(Grafo grafo) {
		super(grafo);
	}
	
	@Override
	public boolean hayRuta(Nodo nodo1, Nodo nodo2) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean darPesoRuta(Nodo nodo1, Nodo nodo2) throws Exception {
		if(!this.grafo.conPeso()) {
			throw new Exception("No es un grafo con peso");
		}
		return false;
	}

}
