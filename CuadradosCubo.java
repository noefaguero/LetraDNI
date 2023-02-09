package arrays;

public class CuadradosCubo {
	public static void main(String[] args) {
//		Definir variables
		int [] numeros = new int [20];
		int [] cuadrados = new int [20];
		int [] cubos = new int [20];
		
		System.out.println("Numeros\tCuadrados\tCubos");
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(Math.random()*101);
			cuadrados[i]=(int)Math.pow(numeros[i], 2);
			cubos[i]=(int)Math.pow(numeros[i], 2);
			System.out.println(numeros[i]+"\t"+cuadrados[i]+"\t\t"+cubos [i]);
			
		}
		
	}
}
