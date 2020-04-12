package T4_Arrays;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// Codificar programa que calcule la suma de valores par/impar del array.
		// ADILEM DOBRAS CASTILLO
		// Codificar programa que calcule la suma de valores par/impar del array.
		Scanner teclado = new Scanner(System.in);
		// AQUI ESTAN MIS VARIABLES
		int numeros[] = new int[50];
		boolean sumar_pares = false;

		int sumador = 0;
		String desicion = "";
		// AQUI LE SOLICITO LA DESICION AL USUARIO
		System.out.println(
				"Hola, diga si (p) si desea calcular la suma de los pares o (i) si desea calcular la suma de los impares ");

		desicion = teclado.nextLine();
		desicion = desicion.toLowerCase();

		// AQUI INICIO UN BUCLE PARA QUE ME CUENTE LOS NUMEROS DEL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		// AQUI INICIO PARA LOS NUMEROS IMPARES..
		if (desicion.equals("i")) {
			sumar_pares = true;


			for (int i = 1; i <= numeros.length; i = i + 2) {
				System.out.print(numeros[i] + ", ");

				sumador += numeros[i];
			}

		}
		//AQUI INICIO PARA LOS NUMEROS PARES..
		if (desicion.equals("p")) {
			sumar_pares = false;
			int i = 0;

			for (i = 0; i < numeros.length; i = i + 2) {
				System.out.print(numeros[i] + ", ");

				sumador += numeros[i];
			}

		}
		// AQUI PONGO MIS BOOLEANOS...
		if (sumar_pares) {
			// AQUI SI EL USUARIO PONE I SERA VERDADERO
			System.out.println();
			System.out.println();
			System.out.println("El total de los impares es:  " + sumador);
		}

		else {
			// EN OTRO CASO SI NO PONE I SERA FALSO Y ME DARA LOS PARES
			System.out.println();
			System.out.println();
			System.out.println("El total de los pares es:  " + sumador);
		}
		teclado.close();
	}

}
