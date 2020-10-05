package grafos;

public abstract class Vertice {
	
	protected Nodo nodo1;
	protected Nodo nodo2;
	
	public Vertice(Nodo nodo1, Nodo nodo2) {
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
	}
	
	public Nodo darNodo1() {
		return this.nodo1;
	}
	
	public Nodo darNodo2() {
		return this.nodo2;
	}

}
