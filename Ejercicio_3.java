package T4_Arrays;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// Codificar programa que calcule la suma de los valores del array
		int Array []=new int [4];
		int sumador=0;
		for(int i=0;i<=Array.length;i++) {
			sumador=sumador+i;
		}
		System.out.println("El resultado de la suma es: "+sumador);
	}

}
