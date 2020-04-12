package T4_Arrays;



public class Ejercicio_5 {

	public static void main(String[] args) {
		// Codificar programa que buscar valor máximo, mínimo y medio de los elementos del array.
		//Imprimirlos por consola
		//ADILEM DOBRAS
				//Codificar programa que buscar valor máximo, mínimo y medio de los elementos del array.
				//Imprimirlos por consola.
				//DECLARO MIS VARIABLES
				int numeros[] = new int[50];
				int i = 0;
				int maximo = 0;
				int minimo = 0;
				int suma=0;
				for (i = 0; i < numeros.length; i++) {
					numeros[i] = i;
				}

				// mostrar valores del 0 al 49
				for (i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + ", ");
					suma+= numeros[i];
					//IF PARA MIS MINIMOS Y MAXIMOS
					if (minimo > numeros[i]) {
						minimo = numeros[i];
					}
					if (maximo <numeros[i]) {
						maximo = numeros[i];
					}

				}
				// MUESTRA POR CONSOLA, MAX, MIN Y MED
				System.out.println();
				System.out.println(" El valor maximo es: " + maximo);
				System.out.println("El valor minimo es: " + minimo);
				System.out.println(suma);
				System.out.println("El valor media es: " +(suma/50));

	

	}

}
