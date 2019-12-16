package Ejercicios;

import utilityPackage.MetodosArray;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[] x;
		int sumatoria=0;
		int media=0;
		
		x=MetodosArray.crearArrayAleatorio(MetodosArray.generarIntAleatorio(1,12), 9, 5);
		MetodosArray.imprimirArrayEnTabla(x);
		
		for (int i = 0; i < x.length; i++) {
			sumatoria+=x[i];
		}
		System.out.println("La sumatoria del arreglo creado es: "+sumatoria);
		
		media=sumatoria/x.length;
		System.out.println("La media de los elementos del arreglo es: "+media);
		
	}
	
	
}
