package view;

import model.Fila;

public class Main {

	public static void main(String[] args) {

		Fila fila = new Fila();

		fila.insert(1);
		fila.insert(2);
		fila.insert(3);
		fila.insert(4);

		System.out.println(fila.toString());
		

	}

}
