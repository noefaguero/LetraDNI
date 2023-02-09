package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxYMin {
	public static void main(String[] args) {
//		Definir variables
		int [] numeros = new int [10];
		Scanner tecla=new Scanner(System.in);
		
//		Introduccion de los datos
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduce un numero");
			numeros[i]=tecla.nextInt();
		}
		
//		Con la funcion .sort ordenamos la array
		Arrays.sort(numeros);
//		Muestra de los resultados
		System.out.println("Minimo: "+numeros[0]);
		System.out.println("Maximo: "+numeros[numeros.length-1]);
		
		tecla.close();
	}
}
