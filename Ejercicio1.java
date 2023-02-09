package arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		int unidimensional[]=new int [20];
		
		for(int i=0; i<unidimensional.length; i++) {
			unidimensional[i]=(int)(1+Math.random()*50);
		}
		System.out.println("Los 20 números obtenidos son: ");
		
		for (int i=0; i<unidimensional.length; i++) {
			System.out.print(unidimensional[i]+" ");
		}
		
		System.out.println();
		
		for (int i=unidimensional.length-1; i>=0; i--) {
			System.out.print(unidimensional[i]+" ");
		}
		
	}
}
