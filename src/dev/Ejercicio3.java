/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que muestra el doble y el	 *
*			   triple de un número.	                 *
*****************************************************/


package dev;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		
		int num; 
		
		System.out.println("Escribe un número: ");
		
		num = sc.nextInt();
		
		System.out.println("El doble del número es;  " + num*2 +". El triple del número es;  "+ num*3);
		
	}
	
	
}
