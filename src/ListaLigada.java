
public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}

	}

	public String toString() {
		// Verificando se a Lista est� vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		// Percorrendo at� o pen�ltimo elemento.
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		// �ltimo elemento
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) { // No come�o.
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) { // No fim.
			this.adiciona(elemento);
		} else {
			Celula anterior = (Celula) this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}

	}

	public Object pegaCelula(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o n�o existe");
		}

		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}

	public Object pega(int posicao) {
		return ((Celula) this.pegaCelula(posicao)).getElemento();
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o n�o existe");
		}
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = (Celula) this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}

	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;

		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProxima();
		}

		return false;
	}

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;

		if (this.totalDeElementos == 0) {
			// caso especial da lista vazia
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}

	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posi��o n�o existe");
		}
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	public void removeDoFim() {
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posi��o n�o existe");
		}
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}

	}
}
