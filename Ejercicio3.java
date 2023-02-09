package arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		String dias[]= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		float temperaturas[]=new float [7];
		float suma=0.0f, average=0.0f;
		Scanner tecla=new Scanner(System.in);
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("Introduce la temperatura del "+dias[i]);
			temperaturas[i]=tecla.nextFloat();
		}
		
		for (int i=0; i<temperaturas.length; i++) {
			suma=suma+temperaturas[i];
		}
		average=suma/temperaturas.length;
		System.out.println("La temperatura media de esta semana ha sido: "+average);
		
		for(int i=0; i<temperaturas.length; i++) {
			if(temperaturas[i]==average) {
				System.out.println("La temperatura este "+dias[i]+"("+temperaturas[i]+") fue IGUAL a la media");
			}
			else {
				if(temperaturas[i]>average) {
					System.out.println("La temperatura este "+dias[i]+"("+temperaturas[i]+") fue SUPERIOR a la media");
				}
				else {
					System.out.println("La temperatura este "+dias[i]+"("+temperaturas[i]+") fue INFERIOR a la media");
				}
			}
		}
		tecla.close();
	}
}