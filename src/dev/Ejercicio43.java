/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción: Programa Java que muestre los números *
* 			   desde 1 hasta N utilzando las ins-	 *
* 				trucciones for, while y do while.	 *				 			 	     *													 					 		
*****************************************************/
package dev;
import java.util.Scanner;

public class Ejercicio43 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduce un número N: ");
	        int n = sc.nextInt();
	        
	        System.out.println("Números utilizando for:");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\nNúmeros utilizando while:");
	        int i = 1;
	        while (i <= n) {
	            System.out.print(i + " ");
	            i++;
	        }
	        
	        System.out.println("\nNúmeros utilizando do..while:");
	        i = 1;
	        do {
	            System.out.print(i + " ");
	            i++;
	        } while (i <= n);
}
}
