/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que dice si dos numeros son	 *
* 			   iguales.	                 			 *
*****************************************************/

package dev;
import java.util.Scanner;

public class Ejercicio20 {
 
	public static void main(String[] args) {
		
		
		int num1,num2;
		System.out.println("Ingrese el primer número; ");
		Scanner sc= new Scanner (System.in);
		num1=sc.nextInt();
		System.out.println("Ingrese el segundo número; ");
		num2=sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Los numeros ingresados son iguales.");
		}else {
			System.out.println("Los numeros ingresados son diferentes.");
		}
		
		
		
	}
	
	
	
}
