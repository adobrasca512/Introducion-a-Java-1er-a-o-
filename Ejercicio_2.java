package T4_Matrices;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// Variables
		int filas = 0;
		int columnas = 0;
		int matriz[][];
		Scanner teclado = new Scanner(System.in);
		
		// Solicitar al usuario las dimensiones
		System.out.print("Introduzca número de filas   : ");
		filas = teclado.nextInt(); // Habría que validar
		System.out.print("Introduzca número de columnas: ");
		columnas = teclado.nextInt(); // Habría que validar
		
		// Crear una matriz con esas dimensiones
		matriz = new int[filas][columnas];
		
		// Solicitar en bucle los valores de cada posición
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.print("Valor ("+ i + "," + j + "):");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		// Imprimir la matriz
		System.out.println("--------------------");
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		teclado.close();
	}

}
