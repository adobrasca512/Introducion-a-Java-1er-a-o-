package T4_Arrays;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// Codificar programa que crea un array.
		// Dicho array debe ser capaz de contener 50 números enteros, con
		// valores aleatorios entre el 0 y el 8000.
		int Array[] = new int[50];
		for (int i = 0; i < Array.length; i++) {

			Array[i] = (int) (8000 * Math.random());
			System.out.println(Array[i]);

		}

	}

}
