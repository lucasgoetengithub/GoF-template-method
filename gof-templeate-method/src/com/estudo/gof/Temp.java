package com.estudo.gof;

public class Temp {
	public static void main(String[] arg) {
		negociar();
	}

	public static void negociar() {
		System.out.println("Exemplo de Item Geral");
		Item normal = new ItemGeral("Sal", 20, 10);
		System.out.println(normal);
		System.out.println("Obter 6 Unidades:");
		normal.remover(6);
		System.out.println(normal);
		System.out.println("Obter 17 Unidades:");
		normal.remover(17);
		System.out.println(normal);

		System.out.println("Exemplo de Item Raro");
		Item raro = new ItemRaro("Plutonio", 5, 20);
		System.out.println(raro);
		System.out.println("Obter 6 Unidades:");
		raro.remover(6);
		System.out.println(raro);
		System.out.println("Obter 3 Unidades:");
		raro.remover(3);
		System.out.println(raro);
	}
}
