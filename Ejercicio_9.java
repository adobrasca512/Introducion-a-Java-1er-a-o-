package T4_Arrays;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TRABAJO ADILEM DOBRAS (EL MAS DIFICIL)
				// Programa para determinar si un array está dentro de otro.
				// DECLARO MIS VARIABLES
				String array1[] = { "1", "4", "3", "5", "1", "2", "3" };
				String array2[] = { "1", "2", "3" };
				boolean contenido = false;
				// recorrer la primera, hasta que encuentre la segunda

				// se verifica si el segundo array es mas grande que el primero
				if (array1.length > array2.length) {
					int i = 0;
					// recorre el primer array...
					for (i = 0; i < array1.length; i++) {
						int j = 0;
						
						// VA A IR CONTANDO AMBOS ARRAYS A LA VEZ..
						while (array2.length > j && array1[i + j] == array2[j]) {
							j++;
						}

						if (j == array2.length) {
							contenido = true;
						}
					}

				} else if (array1.length < array2.length) {
					System.out.println("El array 1 no se encuentra en el Array 2");
				}
				// Aqui se imprimen mis resultados
				if (contenido == true) {
					System.out.println("Esta contenido");

				} else if (contenido == false) {
					System.out.println("No esta contenido");
				}

	}

}
