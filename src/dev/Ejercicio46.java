/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción: Programa Java que lea dos números y   *
* 			   muestre los números pares entre ellos.*													 				 		
*****************************************************/
package dev;
import java.util.Scanner;


public class Ejercicio46 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduce el primer número: ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Introduce el segundo número: ");
	        int num2 = sc.nextInt();
	        
	        int menor = Math.min(num1, num2);
	        int mayor = Math.max(num1, num2);
	        
	        System.out.println("Números pares desde el menor hasta el mayor:");
	        for (int i = menor; i <= mayor; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        
	        sc.close();
	    }
	}
