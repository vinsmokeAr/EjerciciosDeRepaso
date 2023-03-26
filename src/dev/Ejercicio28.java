/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba es un número	 *
* 				del 0 al 9. 						 *				 		 *
*****************************************************/
package dev;

import java.util.Scanner;

public class Ejercicio28 {
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Escribe el número: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		 if(num>=0 && num<=9) {
		 System.out.println("Es un número");
		 }else {
		System.out.println("No es un número");
		 }
	}
}
