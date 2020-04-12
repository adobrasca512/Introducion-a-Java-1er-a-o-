package T4_Matrices;

public class Ejercicio_1While {

	public static void main(String[] args) {
		int matriz1[][] = {{1,1},{2,3}};
		int matriz2[][] = {{0,1},{2,3}};
		int comparaciones = 0; // Vamos a contar cuantas comparamos

		System.out.println(matriz1.length + "x" + matriz1[0].length);
		System.out.println(matriz2.length + "x" + matriz2[0].length);
		
		// Verificar sus dimensiones
		if (matriz1.length != matriz2.length) {	
			// Si tienen dimensiones distintas
			// TIENEN DIFERENTE NÚMERO DE FILAS
			System.out.println("DIFERENTES. Tienen diferente número de filas");
		}
		else if (matriz1[0].length != matriz2[0].length ) {
			// TIENEN DIFERENTE NÚMERO DE COLUMNAS
			System.out.println("DIFERENTES. Tienen diferente número de columnas");
		}
		else {	// Si tienen la misma dimensión, miramos valor a valor
			boolean iguales = true; // confiamos en que sean iguales
			
			int i = 0;
			while(iguales & i<matriz1.length) {
				int j = 0;
				while (iguales & j<matriz1[0].length) {
					comparaciones++;
					if(matriz1[i][j] != matriz2[i][j]) {
						iguales = false;
					}
					j++;
				}
				i++;
			}
			
			if (iguales) {
				System.out.print("¡SON IGUALES!  -  ");
			}
			else {
				System.out.print("¡SON DISTINTAS!  -  ");
			}
			System.out.println(comparaciones + " comparaciones");
			
		}


	}

}
