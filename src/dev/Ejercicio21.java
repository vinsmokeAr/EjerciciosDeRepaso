/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que lee dos números y 		 *
* 			  calcula cual es el mayor.	             *
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		
		double num1,num2;
		System.out.println("Ingresa el primer número; ");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextDouble();
				
		System.out.println("Ingresa el primer número; ");
		num2 = sc.nextDouble();
		
		 if (num1 > num2) {
	            System.out.println("El mayor es " + num1);
	        } else if (num1 < num2) {
	            System.out.println("El mayor es " + num2);
	        } else {
	            System.out.println("Los números son iguales");
	        }
		
	}
	
	
	
}
