package T4_Arrays;

import java.util.Arrays;

public class Ejercicio_7 {

	public static void main(String[] args) {
		//Programa para determinar si un array es un
		//palíndromo.
		// ADILEM DOBRAS
		//Programa para determinar si un array es un
		//palíndromo
		// Declaro mis variables
		String letras[] = { "a", "m", "a", "n", "a", "P", "a", "n", "a", "m", "a" };
		int i = 0;

		// array.copyOf(Array original, numero de valores en el array)
		String[] original = Arrays.copyOf(letras, letras.length);
		int tamaño = letras.length;
		// char[] volteado = new char [letras.length];
		// Se divide entre 2 porque va revisando de mitad en mitad
		for (i = 0; i < tamaño / 2; i++) {
			String guardar = letras[i];
			// Esto lo verifica al revez
			letras[i] = letras[tamaño - i - 1];
			letras[tamaño - i - 1] = guardar;
		}
		
		// to.String es una cadena que optendra valores, Para meterlos al String
		System.out.println("Array Original: " + Arrays.toString(original));
		System.out.println("Array Reverso: " + Arrays.toString(letras));

		// PREGUNTAR, creo que es lo mismo que poner un & (LETRAS & ORIGINAL)
		if (Arrays.equals(letras, original)) {
			System.out.println();
			System.out.println("Es un palindromo");

		} else {
			System.out.println("No es un palindromo");
		}
	}

}
