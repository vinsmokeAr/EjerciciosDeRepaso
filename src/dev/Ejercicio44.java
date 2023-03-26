/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción:  Programa Java que muestre los núme-  *
* 				ros desde N hasta 1 utilizando las   *
* 				instrucciones for, while y do ..while*
*													 *					 		
*****************************************************/



package dev;
import java.util.Scanner;
public class Ejercicio44 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();
        
        System.out.println("Números utilizando for:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nNúmeros utilizando while:");
        int i = n;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        
        System.out.println("\nNúmeros utilizando do..while:");
        i = n;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);

    }
	
	
	
}
