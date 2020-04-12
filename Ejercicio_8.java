package T4_Arrays;



public class Ejercicio_8 {

	public static void main(String[] args) {
		// ADILEM DOBRAS
		//Programa para determinar si dos arrays son iguales.
		int array1[] = { 0, 5, 4, 2, 7 };
		int array2[] = { 0, 5, 4, 2, 7 };
		// AQUI PONGO LA VERSION NORMAL UTILIZANDO FOR

		int tamaño1 = array1.length;
		int tamaño2 = array2.length; 
		boolean iguales= true; 
		int i=0; 
		if(tamaño1==tamaño2) { 
			while(iguales && i<tamaño1) { //int
				if (array1[i]!=array2[i]) {
					iguales=false;

				} i++; }

		} else { System.out.println("Son distintos"); }

		if(iguales==true) { 
			System.out.println("Son iguales " ); 

		} 
		else if(iguales!=true) { 

			System.out.println("Son distintos"); 
		}


	}

}
