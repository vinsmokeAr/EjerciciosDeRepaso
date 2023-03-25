/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que dice si un num. entero   *
* 		      es multiplo de 10.	                 *
*****************************************************/
package dev;
import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Ingresa un numero entero;  ");
		Scanner sc = new Scanner (System.in);
		
		 num = sc.nextInt();
	        
	        if(num % 10 == 0){
	            System.out.println("El número " + num + " es múltiplo de 10");
	        } else {
	            System.out.println("El número " + num + " no es múltiplo de 10");
	        }
		
		
		
		
		
		
	}
	
	
	
	
}
