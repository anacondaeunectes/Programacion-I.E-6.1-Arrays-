package utilityPackage;

public class MetodosArray {
	
	public static int generarIntAleatorio(int min, int max) {
		int numero;
		int rango = (max - min)+1;
		numero=(int)(Math.random()*rango) + min;
		
		return numero;
	}
	
	public static int[] crearArrayAleatorio(int size, int max, int min) {
		int[] array = new int[size];
		int rango=(max - min)+1;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*rango) + min;
		}
		
		return array;
	}
	
	public static int[][] crearMatrizAleatoria(int filas, int columnas, int max, int min){
		int[][]  matriz = new int[filas][columnas];
		int rango=(max - min)+1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]=(int)(Math.random()*rango) + min;
			}
		}
		
		return matriz;
	}
	
	public static void imprimirArrayEnTabla(int v[]) {
		
		System.out.println("Arreglo: ");
		int cont = 0;

		while(cont < v.length) {
			System.out.print("  - ");
			cont++;
		}
		cont=0;
		System.out.print("\n| ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			System.out.print(" | ");
		}
		System.out.print("\n ");
		while(cont < v.length) {
			System.out.print(" -  ");
			cont++;
		}
		System.out.println("\n");
	}
	
	public static void imprimirMatrizEnTabla_mal(int b[][]) {
		System.out.println("Matriz: ");
		int cont = 0;
		while(cont < b[0].length) {
			System.out.print("  - ");
			cont++;
		}
		
		cont=0;

		for (int i = 0; i < b.length; i++) {
			System.out.print("\n| ");
			for (int j = 0; j < b[0].length; j++) {	
				System.out.print(b[i][j]);
				System.out.print(" | ");
			}
			System.out.print("\n ");
			while(cont < b[0].length) {
				System.out.print(" -  ");
				cont++;
			}
			cont=0;
		}

		System.out.println("\n");
	}
	
	public static void imprimirMatrizEnTabla(int d[][]) {
		
		//Instanciamos un array "ancho" que va a ir guardando el numero de digitos del numero con mas digitos de cada columna.
		int ancho[] = new int[d[0].length];
		
		System.out.println("Matriz: ");
		
		//Este "for" recorre la matriz columna por columna de forma descendente. Su funcion es obtener el numero de digitos del numero con mas digitos de cada columna.
		for (int i = 0; i < d[0].length; i++) {
			
			for (int j = 0; j < d.length; j++) {
				
				//Renueva el valor del elemento del array "ancho" que hace referencia a esa columna en caso de que sea mayor.
				if (String.valueOf(d[j][i]).length() > ancho[i]) {
					ancho[i] = String.valueOf(d[j][i]).length();
				}
				
			}
			System.out.println(i+""+ancho[i]);
		}
		
		//Esta matriz va a ser un "espejo" de la principal donde cada elemento va a contener la info del numero de digitos que tiene el "elemento espejo".
		int numDigitos[][] = new int[d.length][d[0].length];
		
		for (int i = 0; i < numDigitos.length; i++) {
			
			for (int j = 0; j < numDigitos[0].length; j++) {
				
				numDigitos[i][j] = String.valueOf(d[i][j]).length();
			}
		}
		
		for (int i = 0; i < d.length; i++) {
				int cont = 0;
				switch (ancho[i]) {
				case 1:
					while(cont < d[0].length) {
						System.out.print("  - ");
						cont++;
					}
					
					break;
	
				default:
					break;
				}
				
				System.out.print("\n| ");
			
			for (int j = 0; j < d[0].length; j++) {
				
				//OJO, la "key" del switch es el ancho en funcion de la columna, es decir, de "j".
				switch (ancho[j]) {
				case 1:
					System.out.print(d[i][j]+" | ");
					break;
				case 2:
						switch (numDigitos[i][j]) {
						case 1:
							System.out.print(" "+d[i][j]+" | ");
							break;

						case 2:
							System.out.print(d[i][j]+" | ");
							break;
						}
					break;
				
				case 3:
						switch (numDigitos[i][j]) {
						case 1:
							System.out.print("  "+d[i][j]+" | ");
							break;

						case 2:
							System.out.print(" "+d[i][j]+" | ");
							break;
						case 3:
							System.out.print(d[i][j]+" | ");
						}
					break;
				}
				
			}
			System.out.print("\n");
			
			for (int j = 0; j < numDigitos.length; j++) {
				switch (ancho[j]) {
				
				case 1:
					while(cont < d[0].length) {
						System.out.print(" - ");
						cont++;
					}
					break;
	
				case 2:
					while (cont < d[0].length) {
						System.out.print(" -- ");
						cont++;
					}
					break;
				}
			}
			
		}
		
		
		
	}
}

//https://stackoverflow.com/questions/7961788/math-random-explanation