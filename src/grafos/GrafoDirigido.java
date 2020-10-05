package grafos;

import javax.enterprise.inject.Alternative;

@Alternative
public class GrafoDirigido extends Grafo {
	
	public GrafoDirigido(boolean conPeso) {
		super(conPeso);
	}
	
	@Override
	public void verificarVertices(Nodo nodo1, Nodo nodo2) throws Exception {
		for (Vertice v : this.vertices) {
			if (v.darNodo1().darNombre() == nodo1.darNombre() && v.darNodo2().darNombre() == nodo2.darNombre()) {
				throw new Exception("Vertice ya existe");
			}
		}
	}

	@Override
	public void agregarVertice(Nodo nodo1, Nodo nodo2) throws Exception {
		if (this.conPeso) {
			throw new Exception("No se puede agregar vertice sin peso a grafo con peso");
		}
		this.verificarVertices(nodo1, nodo2);
		Vertice vertice = new VerticeNoPesado(nodo1, nodo2);
		this.vincularNodosYVertice(nodo1, nodo2, vertice);
	}
	
	@Override
	public void agregarVertice(Nodo nodo1, Nodo nodo2, int peso) throws Exception {
		if (!this.conPeso) {
			throw new Exception("No se puede agregar vertice con peso a grafo sin peso");
		}
		this.verificarVertices(nodo1, nodo2);
		Vertice vertice = new VerticePesado(nodo1, nodo2, peso);
		this.vincularNodosYVertice(nodo1, nodo2, vertice);
	}
}
