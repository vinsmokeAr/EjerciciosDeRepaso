package dev;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		double radio,result,k; 
		
		System.out.println("Ingresa el radio de la esfera para calcular su volumen; ");
		
		Scanner sc = new Scanner (System.in);		
		radio = sc.nextDouble();
		result = 4.0/3.0 * Math.PI * Math.pow(radio, 3);
		
		System.out.println("El volumen de la esfera de; " + result); 
		
	
	}
	
	
	
	
}
