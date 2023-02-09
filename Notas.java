package arrays;

import java.util.Arrays;

public class Notas {
	public static void main(String[] args) {
//		String nombre="";
//		int notaProgramacion=0, notaBD=0, notaED=0, notaSiSi=0, notaIngles=0;
//		
//		float total=notaProgramacion+notaBD+notaED+notaSiSi+notaIngles;
		
//		Declaracion de array reservando 5 posiciones
		int notas[]=new int[5];
//		Asignar valores a los elementos de la array
		for(int i=0; i<notas.length; i++) {
//			Insertar valores en el array
			notas[i]=(int)(1+Math.random()*10);
//			Mostar elementos de la array
			System.out.println("Nota "+i+": "+notas[i]);
		}
		
		float suma=0.0f;
//		Media de las notas
		for(int i=0; i<notas.length; i++) {
//			Recorrido el array
			suma=suma+notas[i];
		}
		System.out.println("La nota media es: "+suma/notas.length);
		
//		Array de strings
		String diasSemana[]= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		System.out.println(diasSemana[0].toUpperCase());
		
		Arrays.sort(notas);
	}
}
