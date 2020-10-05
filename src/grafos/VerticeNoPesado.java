package grafos;

import javax.enterprise.inject.Alternative;

@Alternative
public class VerticeNoPesado extends Vertice {
	
	public VerticeNoPesado(Nodo nodo1, Nodo nodo2) {
		super(nodo1, nodo2);
	}
}
