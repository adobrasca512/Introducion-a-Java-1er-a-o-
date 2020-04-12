package T4_Arrays;

import java.util.Arrays;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TRABAJO DE ADILEM DOBRAS
		// Debe guardar en un array los tres valores resultantes.
		int numeros[] = new int[50];
		int i = 0;
		int maximo = 0;
		int minimo = 0;
		int suma = 0;

		for (i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}

		// mostrar valores del 0 al 49
		//ESTO ES PARA VER SI SON MAXIMOS O MINIMOS
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
			suma += numeros[i];

			if (minimo > numeros[i]) {
				minimo = numeros[i];
			}
			if (maximo < numeros[i]) {
				maximo = numeros[i];

			}

		}
		System.out.println();
		// Guardo los resultados en un array y los imprimo (preguntar)
		System.out.println(" El valor maximo es: " + maximo);
		System.out.println("El valor minimo es: " + minimo);
		//CALCULO LA MEDIA 
		int media = suma / 50;
		
		System.out.println("El valor media es: " + media);
		System.out.println("Los valores guardados son:");
		// GUARDO MIS RESULTADOS EN ARRAYS..
		int guardar[] = { maximo, minimo, media };
		System.out.println(Arrays.toString(guardar));
	}

}
