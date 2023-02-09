package arrays;

import java.util.Scanner;

public class DNI {
	public static void main(String[] args) {
//		Definir variables
		Scanner tecla=new Scanner (System.in);
		String dni="";
		String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		int posicion=0;
		System.out.println("Introduce DNI");
		dni=tecla.next();
		if (dni.length()==8) {
			if(dni.matches("^[0-9]{8}$")) {
//				Ver letra
				posicion=Integer.parseInt(dni)%23;
				System.out.println("NIF: "+dni+letras[posicion]);
			}
			else {
				System.out.println("8 numeros");
			}
		}
		else {
			System.out.println("Introduce 8 numeros");
		}
		
	}
}
