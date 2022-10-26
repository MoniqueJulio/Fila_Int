package model;

public class Fila {

	No inicio;
	No fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {

		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int valor) {

		No elemento = new No();
		elemento.dado = valor;

		// Verificar se é o primeiro elemento
		if (inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		}

		else {

			if (inicio == fim && inicio != null) {

				fim = elemento;
				inicio.proximo = fim;
				elemento.proximo = null;
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
	}

	public int remove() throws Exception {

		if (isEmpty()) {
			throw new Exception("Fila Vazia!");
		}
		No auxiliar = inicio;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		}

		else {
			inicio = inicio.proximo;
		}
		return auxiliar.dado;
	}

	public void list() throws Exception {

		if (isEmpty()) {
			throw new Exception("Fila vazia");
		}

		No auxiliar = inicio;

		while (auxiliar != null) {

			System.out.print(auxiliar.toString() + " ");
			auxiliar = auxiliar.proximo;
		}
	}

	public int size() {
		int contador = 0;

		if (!isEmpty()) {
			No auxiliar = inicio;
			while (auxiliar != null) {
				contador++;
				auxiliar = auxiliar.proximo;
			}
		}
		return contador;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		No auxiliar = inicio;
		while (auxiliar != null) {
			buffer.append("[");
			buffer.append(auxiliar.dado);
			buffer.append("]");
			buffer.append("->");

			auxiliar = auxiliar.proximo;
		}
		buffer.append("null");
		return buffer.toString();
	}
}
