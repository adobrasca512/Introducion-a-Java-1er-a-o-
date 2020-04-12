package T4_Arrays;

public class Ejercicio_1 {

	public static void main(String[] args) {
	//  array debe ser capaz de contener 50 números enteros, con valores del 0 al 49.
			int Array []=new int [50];
			for(int i=0; i<Array.length;i++) {
				Array[i]=i;
				System.out.println(Array[i]); 
			}
	}

}
