package Ejercicios;

import utilityPackage.MetodosArray;

public class Ejercicio3 {

	public static void main(String[] args) {
		int matriz[][];
		matriz = MetodosArray.crearMatrizAleatoria(5, 8, 11, 1);
		MetodosArray.imprimirMatrizEnTabla_mal(matriz);
		MetodosArray.imprimirMatrizEnTabla(matriz);
	}

}
	