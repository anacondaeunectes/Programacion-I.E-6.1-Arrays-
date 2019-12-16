package Ejercicios;

import utilityPackage.MetodosArray;
import java.util.Scanner;

public class Ejercicio1_repasar {

	public static void main(String[] args) {
		int array[] = new int[5]; 
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca el valor del elemento "+(i+1)+": ");
			int valor = teclado.nextInt();
			
			array[i] = valor;
			System.out.println(valor);
		}
		//OJO, solo pueden ser enteros. Controlar esto con excepciones.
	}

}
