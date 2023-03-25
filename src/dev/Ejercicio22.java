/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 22/03/2023						 *
* Fecha de actualización: 22/03/2023 				 *
* Descripción: Programa que comprueba si dos números *
* 			   enteros terminan con la misma cifra	 *
*****************************************************/


package dev;
import java.util.Scanner;
public class Ejercicio22 {
	 public static void main(String[] args) {
	        
	        int num1, num2;

	        System.out.print("Introduzca primer número: ");
	        Scanner sc = new Scanner(System.in);
	        num1 = sc.nextInt();
	        System.out.print("Introduzca segundo número: ");
	        num2 = sc.nextInt();

	        if (num1 % 10 == num2 % 10) {
	            System.out.println("Los dos números acaban con la misma cifra");                                      
	        } else {
	            System.out.println("Los números acaban con cifras distintas");
	        }
	    }
	
	
	

}
