/*****************************************************
* Autor: Arleth Machuca Fabian						 *
* Fecha de creación: 25/03/2023						 *
* Fecha de actualización: 25/03/2023 				 *
* Descripción:  Programa que muestre los múltiplos   *
* 				de un número desde 1 hasta M         *													 				 		
*****************************************************/
package dev;
import java.util.Scanner;
public class Ejercicio47 {
	public static void main(String[] args) {
       
        
        System.out.print("Introduce un número: ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        
        System.out.print("Introduce el número máximo de múltiplos a mostrar: ");
        int max = sc.nextInt();
        
        System.out.println("Múltiplos de " + num + " desde 1 hasta " + max + ":");
        for (int i = 1; i <= max; i++) {
            if (i % num == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
