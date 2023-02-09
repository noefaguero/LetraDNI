package arrays;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		int numeros[]=new int [20];
		int n=0, cont=0;
		
		for (int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(1+Math.random()*25);
		}
		
		System.out.println("¿Que valor deseas buscar?");
		n=tecla.nextInt();
		
		for(int i=0; i<numeros.length; i++) {
			if(n==numeros[i]) {
				cont++;
				System.out.println("Se ha encontrado el valor "+n+" en la posicion "+(i+1));
			}
		}
		System.out.println("El valor "+n+" se ha encontrado "+cont+" vece/s");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
}