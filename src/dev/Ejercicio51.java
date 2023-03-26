/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción:  Contar los números positivos   	     *
* 				introducidos por teclado			 *
*													 *				 		
*****************************************************/

package dev;
import java.util.Scanner;


public class Ejercicio51 {

	public class ContarPositivos {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;
	        int contador = 0;
	        
	        do {
	            System.out.print("Introduce un número (0 para salir): ");
	            num = sc.nextInt();
	            if (num > 0) {
	                contador++;
	            }
	        } while (num != 0);
	        
	        System.out.println("Se han introducido " + contador + " números positivos.");
	        
	        sc.close();
	    }	
	}
}