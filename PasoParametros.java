package arrays;

import java.util.Arrays;

public class PasoParametros {
	public static void main(String[] args) {
		int a=3;
		int b=6;
		System.out.println("a="+a+" b="+b);
		intercambio (a, b);
		System.out.println("a="+a+" b="+b);
		
		int [] n= {1, 4, 2, 3, 7};
		int [] copia= new int [5];
		
		copia=n;
		System.out.println(Arrays.toString(n));
		Arrays.sort(copia);
		System.out.println(Arrays.toString(copia));
		
		intercambio(n);
		System.out.println(Arrays.toString(n));
		
	}

//	Paso de parametro por referencia (direccion de memoria)
	private static void intercambio(int[] n) {
		int aux=n[0];
		n[0]=n[n.length-1];
		n[n.length-1]=aux;
		
	}

//	Paso de parametro por valor (copia)
	private static void intercambio(int a, int b) {
		int aux=a;
		a=b;
		b=aux;
		
	}
}
