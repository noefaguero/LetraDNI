package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JuegoBarcos {
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		String boleto = "AAAAAAAAAA";
		String ganador = "AAAAAAAAAA";
		int intro=0;
		
		getBoleto(boleto);
		
		imprimeBoleto(boleto);
		
		
		
	}

	private static void imprimeBoleto(String boleto) {
		System.out.println("El boleto es: "+boleto);
		
	}

	private static void getBoleto(String boleto) {
		int n=0;
		for (int i=4; i>0; i--) {
			do {
				n=(int)(Math.random()*10);
			}while(boleto.charAt(n)=='B');
			
			boleto=boleto.substring(0, (i-1))+"B"+boleto.substring((i+1), boleto.length());
		}
		
	}
}
