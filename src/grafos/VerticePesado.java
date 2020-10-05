package grafos;

import javax.enterprise.inject.Alternative;

@Alternative
public class VerticePesado extends Vertice {

	private int peso;
	
	public VerticePesado(Nodo nodo1, Nodo nodo2, int peso) {
		super(nodo1, nodo2);
		this.peso = peso;
	}

	public int darPeso() {
		return this.peso;
	}

	public void cambiarPeso(int peso) {
		this.peso = peso;
	}
	
}
