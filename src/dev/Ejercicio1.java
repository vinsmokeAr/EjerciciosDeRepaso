/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que pide y muestra dos 		 *
*  		       numeros enteros	                     *
*****************************************************/
package dev;

import java.util.Scanner;

public class Ejercicio1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("ingresa el primer número; ");
		num1 = sc.nextInt();
		System.out.println("ingresa el segundo número; ");
		num2 = sc.nextInt();
		System.out.println("El primer número ingresado es: " + num1 + ". El segundo número es: " +num2);
		
	}
	
	
}
