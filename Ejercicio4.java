package arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
		int bloque1[]=new int [5];
		int bloque2=0;
		int n=0;
		
		System.out.print("Bloque 1: ");
		for(int i=0; i<5; i++) {
			
			do {
				n=(int)(1+Math.random()*54);
			} while (existeN(n, bloque1));
			
			bloque1[i]=n;
			System.out.print(bloque1[i]+" ");
		}
		
		System.out.println();
		
		bloque2=(int)(Math.random()*10);
		System.out.println("Bloque 2: "+bloque2);
		
	}

	private static boolean existeN(int n, int bloque1 []) {
		for(int i=0; i<bloque1.length; i++) {
			if (n==bloque1 [i]) {
				return true;
			}
		}
		return false;
	}
}
