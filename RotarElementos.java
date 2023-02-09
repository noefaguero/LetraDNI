package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotarElementos {
	public static void main(String[] args) {
//		Definir variables
		int [] n = new int [15];
		Scanner tecla=new Scanner(System.in);
		
//		Introduccion de datos
		for(int i=0; i<n.length; i++) {
			System.out.println("Introduce un numero");
			n[i]=tecla.nextInt();
		}
		System.out.println(Arrays.toString(n));
		
//		Variable para guardar el ultimo numero
		int ultimo=n[n.length-1];

		for(int i=n.length-2; i>=0; i--) {
//			Este bucle corre la posicion i a la posicion i+1
			n[i+1]=n[i];
		}
		
		n[0]=ultimo;
		
//		Muestra del resultado
		System.out.println(Arrays.toString(n));
		
		tecla.close();
	}
}
