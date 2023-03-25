/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que muestra las cinco cifras *
* 			de un número desde el comienzo           *
*****************************************************/
package dev;
import java.util.Scanner;



public class Ejercicio11 {
	
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt();                              
	        System.out.println(N/10000);
	        System.out.println(N/1000);
	        System.out.println(N/100);
	        System.out.println(N/10);
	        System.out.println(N);
	    }
	

}
