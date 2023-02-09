package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
//		Definir variables
		Scanner tecla=new Scanner (System.in);
		System.out.println("Introduce el nombre del primer jugador:");
		String nombre1=tecla.next();
		System.out.println("Introduce el nombre del sugndo jugador:");
		String nombre2=tecla.next();
		int [] boleto1 = new int [5];
		int	[] boleto2 = new int [5];
		int [] ganador = {0, 0, 0, 0, 0};
		
		getBoleto(boleto1);
		getBoleto(boleto2);
		
		imprimeJugador(nombre1, getAlias(nombre1), boleto1);
		imprimeJugador(nombre2, getAlias(nombre2), boleto2);
		
		int n=0;
		
		do {
			n=(int)(1+Math.random()*20);
			System.out.println("Ha salido el: "+n);
			comprueba(n, boleto1);
			comprueba(n, boleto2);
//			No es necesario imprimir aqui el boleto porque lo hacemos en el metodo comprueba
//			System.out.println(Arrays.toString(boleto1));
//			System.out.println(Arrays.toString(boleto2));
			System.out.println("*****************************");
		} while(!Arrays.equals(boleto1, ganador) && !Arrays.equals(boleto2, ganador));
		
		if(Arrays.equals(boleto1, ganador) && !Arrays.equals(boleto2, ganador)) {
			System.out.println("Ha ganado "+nombre1);
		}
		if (!Arrays.equals(boleto1, ganador) && Arrays.equals(boleto2, ganador)) {
			System.out.println("Ha ganado "+nombre2);
		}
		else {
			System.out.println("Empate");
		}
		tecla.close();
	}

	private static void comprueba(int n, int [] boleto) {
		for (int i=0; i<5; i++) {
			if (n==boleto[i]) {
				boleto[i]=0;
			}
		}
		System.out.println(Arrays.toString(boleto));
	}

	private static void imprimeJugador(String nombre, String alias, int [] boleto) {
		System.out.println("El jugador "+nombre+" con el alias "+alias+" tiene el boleto "+Arrays.toString(boleto));
		System.out.println("*******************************************************");
	}

	private static String getAlias(String nombre) {
		String alias="";
		for(int i=0; i<3; i++) {
			alias=alias+nombre.charAt(i);
		}
		
		alias="J"+alias+(int)(Math.random()*101);
		
		return alias;
	}

	private static void getBoleto(int boleto[]) {
		int n=0;
		for(int i=0; i<5; i++) {
		
			do {
				n=(int)(1+Math.random()*20);
			}while(existeN(n, boleto));
			
			boleto[i]=n;
		}
		Arrays.sort(boleto);
	}

	private static boolean existeN(int n, int boleto[]) {
		for(int i=0; i<boleto.length; i++) {
			if (n==boleto[i]) {
				return true;
			}
		}
		return false;
	}
}
