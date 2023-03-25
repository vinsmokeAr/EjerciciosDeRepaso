/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que calcula si un num es par *
* 			   o impar.	                             *
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio17 {

public static void main(String[] args) {
		
		int num;
		
		System.out.println("Ingresa un número entero; ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if ( num%2 == 0 ) {
			System.out.println("El número ingresado es par");
		}else {
			System.out.println("el número ingresado es impar");
		}	
			
		}
	
}
